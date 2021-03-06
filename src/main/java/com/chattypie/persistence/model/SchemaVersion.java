/*
 * Copyright 2017 AppDirect, Inc. and/or its affiliates
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chattypie.persistence.model;

import javax.annotation.Generated;

/**
 * SchemaVersion is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class SchemaVersion {

    public SchemaVersion() {
    }

    public SchemaVersion(Integer checksum, String description, Integer executionTime, String installedBy, java.sql.Timestamp installedOn, Integer installedRank, String script, Boolean success, String type, String version) {
        this.checksum = checksum;
        this.description = description;
        this.executionTime = executionTime;
        this.installedBy = installedBy;
        this.installedOn = installedOn;
        this.installedRank = installedRank;
        this.script = script;
        this.success = success;
        this.type = type;
        this.version = version;
    }

    private Integer checksum;

    private String description;

    private Integer executionTime;

    private String installedBy;

    private java.sql.Timestamp installedOn;

    private Integer installedRank;

    private String script;

    private Boolean success;

    private String type;

    private String version;

    public Integer getChecksum() {
        return checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public String getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    public java.sql.Timestamp getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(java.sql.Timestamp installedOn) {
        this.installedOn = installedOn;
    }

    public Integer getInstalledRank() {
        return installedRank;
    }

    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
         return "checksum = " + checksum + ", description = " + description + ", executionTime = " + executionTime + ", installedBy = " + installedBy + ", installedOn = " + installedOn + ", installedRank = " + installedRank + ", script = " + script + ", success = " + success + ", type = " + type + ", version = " + version;
    }

}

