/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.connector.jdbc.databases.mysql.catalog;

import org.apache.flink.connector.jdbc.testutils.DatabaseMetadata;
import org.apache.flink.connector.jdbc.testutils.databases.mysql.MySql57Database;

import org.junit.jupiter.api.extension.RegisterExtension;

/** E2E test for {@link MySqlCatalog} with MySql version 5.7. */
class MySql57CatalogITCase extends MySqlCatalogTestBase {
    @RegisterExtension private static final MySql57Database DATABASE = new MySql57Database();

    @Override
    public DatabaseMetadata getMetadata() {
        return MySql57Database.getMetadata();
    }
}
