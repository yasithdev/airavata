/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

include "../airavata-apis/airavata_commons.thrift"
include "../airavata-apis/airavata_errors.thrift"
include "../airavata-apis/messaging_events.thrift"
include "../airavata-apis/security_model.thrift"
include "../airavata-apis/db_event_model.thrift"
include "app-catalog-models/app_catalog_models.thrift"
include "credential-store-models/credential_store_models.thrift"
include "experiment-catalog-models/experiment_catalog_models.thrift"
include "replica-catalog-models/replica_catalog_models.thrift"
include "resource-catalog-models/resource_catalog_models.thrift"
include "user-tenant-group-models/user_tenant_group_models.thrift"
include "workflow-models/workflow_data_model.thrift"

namespace java org.apache.airavata.model
namespace php Airavata.Model
namespace cpp apache.airavata.model
namespace py airavata.model

/*
 * This file describes the definitions of the Airavata Execution Data Structures. Each of the
 *   language specific Airavata Client SDK's will translate this neutral data model into an
 *   appropriate form for passing to the Airavata Server Execution API Calls.
*/



