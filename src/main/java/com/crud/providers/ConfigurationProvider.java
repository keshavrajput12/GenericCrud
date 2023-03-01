package com.crud.providers;

import com.crud.CrudDropwizardConfiguration;
import io.dropwizard.setup.Environment;

public class ConfigurationProvider {
    private static final ConfigurationProvider INSTANCE = new ConfigurationProvider();

    private CrudDropwizardConfiguration crudDropwizardConfiguration;
    private Environment environment;

    private ConfigurationProvider(){}

    public static ConfigurationProvider getInstance() {
        return  INSTANCE;
    }
    public void init(CrudDropwizardConfiguration configuration, Environment environment){
        if(this.crudDropwizardConfiguration == null && this.environment == null){
            this.environment = environment;
            this.crudDropwizardConfiguration = configuration;
        }
    }


    CrudDropwizardConfiguration getCrudDropwizardConfiguration() {
        return crudDropwizardConfiguration;
    }

    Environment getEnvironment() {
        return environment;
    }
}
