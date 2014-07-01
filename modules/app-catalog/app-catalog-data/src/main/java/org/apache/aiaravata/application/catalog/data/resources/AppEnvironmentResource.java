/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.aiaravata.application.catalog.data.resources;

import org.airavata.appcatalog.cpi.AppCatalogException;
import org.apache.aiaravata.application.catalog.data.model.AppEnvironment;
import org.apache.aiaravata.application.catalog.data.model.AppEnvironment_PK;
import org.apache.aiaravata.application.catalog.data.model.ApplicationDeployment;
import org.apache.aiaravata.application.catalog.data.util.AppCatalogJPAUtils;
import org.apache.aiaravata.application.catalog.data.util.AppCatalogQueryGenerator;
import org.apache.aiaravata.application.catalog.data.util.AppCatalogResourceType;
import org.apache.airavata.common.exception.ApplicationSettingsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppEnvironmentResource extends AbstractResource {
    private final static Logger logger = LoggerFactory.getLogger(AppEnvironmentResource.class);
    private String deploymentId;
    private String name;
    private String value;
    private AppDeploymentResource appDeploymentResource;

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AppDeploymentResource getAppDeploymentResource() {
        return appDeploymentResource;
    }

    public void setAppDeploymentResource(AppDeploymentResource appDeploymentResource) {
        this.appDeploymentResource = appDeploymentResource;
    }

    @Override
    public void remove(Object identifier) throws AppCatalogException {
        HashMap<String, String> ids;
        if (identifier instanceof Map){
            ids = (HashMap)identifier;
        }else {
            logger.error("Identifier should be a map with the field name and it's value");
            throw new AppCatalogException("Identifier should be a map with the field name and it's value");
        }
        EntityManager em = null;
        try {
            em = AppCatalogJPAUtils.getEntityManager();
            em.getTransaction().begin();
            AppCatalogQueryGenerator generator= new AppCatalogQueryGenerator(APP_ENVIRONMENT);
            generator.setParameter(AppEnvironmentConstants.DEPLOYMENT_ID, ids.get(AppEnvironmentConstants.DEPLOYMENT_ID));
            generator.setParameter(AppEnvironmentConstants.NAME, ids.get(AppEnvironmentConstants.NAME));
            Query q = generator.deleteQuery(em);
            q.executeUpdate();
            em.getTransaction().commit();
            em.close();
        } catch (ApplicationSettingsException e) {
            logger.error(e.getMessage(), e);
            throw new AppCatalogException(e);
        } finally {
            if (em != null && em.isOpen()) {
                if (em.getTransaction().isActive()){
                    em.getTransaction().rollback();
                }
                em.close();
            }
        }
    }

    @Override
    public Resource get(Object identifier) throws AppCatalogException {
        HashMap<String, String> ids;
        if (identifier instanceof Map){
            ids = (HashMap)identifier;
        }else {
            logger.error("Identifier should be a map with the field name and it's value");
            throw new AppCatalogException("Identifier should be a map with the field name and it's value");
        }
        EntityManager em = null;
        try {
            em = AppCatalogJPAUtils.getEntityManager();
            em.getTransaction().begin();
            AppCatalogQueryGenerator generator = new AppCatalogQueryGenerator(APP_ENVIRONMENT);
            generator.setParameter(AppEnvironmentConstants.DEPLOYMENT_ID, ids.get(AppEnvironmentConstants.DEPLOYMENT_ID));
            generator.setParameter(AppEnvironmentConstants.NAME, ids.get(AppEnvironmentConstants.NAME));
            Query q = generator.selectQuery(em);
            AppEnvironment appEnvironment = (AppEnvironment) q.getSingleResult();
            AppEnvironmentResource resource =
                    (AppEnvironmentResource) AppCatalogJPAUtils.getResource(AppCatalogResourceType.APP_ENVIRONMENT, appEnvironment);
            em.getTransaction().commit();
            em.close();
            return resource;
        } catch (ApplicationSettingsException e) {
            logger.error(e.getMessage(), e);
            throw new AppCatalogException(e);
        } finally {
            if (em != null && em.isOpen()) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                em.close();
            }
        }
    }

    @Override
    public List<Resource> get(String fieldName, Object value) throws AppCatalogException {
        List<Resource> appEnvironmentList = new ArrayList<Resource>();
        EntityManager em = null;
        try {
            em = AppCatalogJPAUtils.getEntityManager();
            em.getTransaction().begin();
            Query q;
            AppCatalogQueryGenerator generator = new AppCatalogQueryGenerator(APP_ENVIRONMENT);
            List results;
            if (fieldName.equals(AppEnvironmentConstants.DEPLOYMENT_ID)) {
                generator.setParameter(AppEnvironmentConstants.DEPLOYMENT_ID, value);
                q = generator.selectQuery(em);
                results = q.getResultList();
                if (results.size() != 0) {
                    for (Object result : results) {
                        AppEnvironment appEnvironment = (AppEnvironment) result;
                        AppEnvironmentResource resource =
                                (AppEnvironmentResource) AppCatalogJPAUtils.getResource(AppCatalogResourceType.APP_ENVIRONMENT, appEnvironment);
                        appEnvironmentList.add(resource);
                    }
                }
            } else if (fieldName.equals(AppEnvironmentConstants.NAME)) {
                generator.setParameter(AppEnvironmentConstants.NAME, value);
                q = generator.selectQuery(em);
                results = q.getResultList();
                if (results.size() != 0) {
                    for (Object result : results) {
                        AppEnvironment appEnvironment = (AppEnvironment) result;
                        AppEnvironmentResource resource =
                                (AppEnvironmentResource) AppCatalogJPAUtils.getResource(AppCatalogResourceType.APP_ENVIRONMENT, appEnvironment);
                        appEnvironmentList.add(resource);
                    }
                }
            }else {
                em.getTransaction().commit();
                em.close();
                logger.error("Unsupported field name for App Environment resource.", new IllegalArgumentException());
                throw new IllegalArgumentException("Unsupported field name for App Environment resource.");
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new AppCatalogException(e);
        } finally {
            if (em != null && em.isOpen()) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                em.close();
            }
        }
        return appEnvironmentList;
    }

    @Override
    public List<String> getIds(String fieldName, Object value) throws AppCatalogException {
        logger.error("Unsupported for objects with a composite identifier");
        throw new AppCatalogException("Unsupported for objects with a composite identifier");
    }

    @Override
    public void save() throws AppCatalogException {
        EntityManager em = null;
        try {
            em = AppCatalogJPAUtils.getEntityManager();
            AppEnvironment existigAppEnv = em.find(AppEnvironment.class, new AppEnvironment_PK(deploymentId, name));
            em.close();

            em = AppCatalogJPAUtils.getEntityManager();
            em.getTransaction().begin();

            ApplicationDeployment deployment = em.find(ApplicationDeployment.class, deploymentId);
            if (existigAppEnv !=  null){
                existigAppEnv.setValue(value);
                existigAppEnv.setApplicationDeployment(deployment);
                em.merge(existigAppEnv);
            }else {
                AppEnvironment appEnvironment = new AppEnvironment();
                appEnvironment.setDeploymentID(deploymentId);
                appEnvironment.setName(name);
                appEnvironment.setValue(value);
                appEnvironment.setApplicationDeployment(deployment);
                em.persist(appEnvironment);
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new AppCatalogException(e);
        } finally {
            if (em != null && em.isOpen()) {
                if (em.getTransaction().isActive()){
                    em.getTransaction().rollback();
                }
                em.close();
            }
        }
    }

    @Override
    public boolean isExists(Object identifier) throws AppCatalogException {
        HashMap<String, String> ids;
        if (identifier instanceof Map){
            ids = (HashMap)identifier;
        }else {
            logger.error("Identifier should be a map with the field name and it's value");
            throw new AppCatalogException("Identifier should be a map with the field name and it's value");
        }
        EntityManager em = null;
        try {
            em = AppCatalogJPAUtils.getEntityManager();
            AppEnvironment appEnvironment = em.find(AppEnvironment.class,
                    new AppEnvironment_PK(ids.get(AppEnvironmentConstants.DEPLOYMENT_ID),
                            ids.get(AppEnvironmentConstants.NAME)));
            em.close();
            return appEnvironment != null;
        } catch (ApplicationSettingsException e) {
            logger.error(e.getMessage(), e);
            throw new AppCatalogException(e);
        } finally {
            if (em != null && em.isOpen()) {
                if (em.getTransaction().isActive()){
                    em.getTransaction().rollback();
                }
                em.close();
            }
        }
    }
}