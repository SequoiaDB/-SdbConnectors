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

package com.sequoiadb.flink.format.json.ogg;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.ConfigOptions;
import org.apache.flink.formats.json.JsonFormatOptions;

/** Option utils for ogg-json format. */
@PublicEvolving
public class OggJsonFormatOptions {

    public static final ConfigOption<Boolean> IGNORE_PARSE_ERRORS =
            JsonFormatOptions.IGNORE_PARSE_ERRORS;

    public static final ConfigOption<String> TIMESTAMP_FORMAT = JsonFormatOptions.TIMESTAMP_FORMAT;

    public static final ConfigOption<String> JSON_MAP_NULL_KEY_MODE =
            JsonFormatOptions.MAP_NULL_KEY_MODE;

    public static final ConfigOption<String> JSON_MAP_NULL_KEY_LITERAL =
            JsonFormatOptions.MAP_NULL_KEY_LITERAL;

    public static final ConfigOption<String> PRIMARY_KEYS =
            ConfigOptions
                    .key("table.primary-keys")
                    .stringType()
                    .noDefaultValue();

    /**
     * UPDATE Type Changelog's Partition Policy, default is u-by-aft
     *  1. p-by-bef: partitioned by primary-keys in Ogg Log's before field
     *  2. p-by-aft: partitioned by primary-keys in Ogg Log's after field
     */
    public static final ConfigOption<String> CHANGELOG_PARTITION_POLICY =
            ConfigOptions
                    .key("changelog.partition-policy")
                    .stringType()
                    .defaultValue("p-by-aft");

    private OggJsonFormatOptions() {}
}
