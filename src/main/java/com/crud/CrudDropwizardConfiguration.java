package com.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import lombok.Data;

@Data
public class CrudDropwizardConfiguration extends Configuration {
    @JsonProperty("database")
    private DataSourceFactory dataSourceFactory;
    public String getTemplate() {
        return "getTemplate";
    }
    public String getDefaultName() {
        return "getDefaultName";
    }
}
