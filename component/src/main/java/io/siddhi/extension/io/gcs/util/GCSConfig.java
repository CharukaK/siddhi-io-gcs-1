/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package io.siddhi.extension.io.gcs.util;

/**
 * Class to hold common configuration required for the GCS Source/Sink
 */
public class GCSConfig {

    private String bucketName;
    private String authFilePath;

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public void setAuthFilePath(String authFilePath) {
        this.authFilePath = authFilePath;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getAuthFilePath() {
        return authFilePath;
    }
}
