/*
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
 */

package org.apache.airavata.workflow.core.dag.nodes;

import org.apache.airavata.model.ComponentState;
import org.apache.airavata.model.ComponentStatus;
import org.apache.airavata.model.NodeModel;
import org.apache.airavata.model.application.io.InputDataObjectType;
import org.apache.airavata.workflow.core.dag.port.OutPort;

public class InputNodeImpl implements InputNode {

    private NodeModel nodeModel;
    private OutPort outPort;
    private InputDataObjectType inputDataObjectType;

    public InputNodeImpl(NodeModel nodeModel) {
        this.nodeModel = nodeModel;
    }

    @Override
    public void setNodeModel(NodeModel nodeModel) {
        this.nodeModel = nodeModel;
    }

    @Override
    public NodeModel getNodeModel() {
        return nodeModel;
    }

    @Override
    public String getId() {
        return getNodeModel().getNodeId();
    }

    @Override
    public String getName() {
        return getNodeModel().getName();
    }

    @Override
    public NodeType getType() {
        return NodeType.WORKFLOW_INPUT;
    }

    @Override
    public ComponentState getState() {
        return getStatus().getState();
    }

    @Override
    public ComponentStatus getStatus() {
        return getNodeModel().getStatus();
    }

    @Override
    public void setStatus(ComponentStatus newStatus) {
        getNodeModel().setStatus(newStatus);
    }

    @Override
    public boolean isReady() {
        return (inputDataObjectType.getValue() != null && !inputDataObjectType.getValue().equals(""))
                || !inputDataObjectType.isIsRequired();
    }

    @Override
    public InputDataObjectType getInputObject() {
        return this.inputDataObjectType;
    }

    @Override
    public void setInputObject(InputDataObjectType inputObject) {
        this.inputDataObjectType = inputObject;
    }

    @Override
    public OutPort getOutPort() {
        return this.outPort;
    }

    @Override
    public void setOutPort(OutPort outPort) {
        this.outPort = outPort;
    }


}