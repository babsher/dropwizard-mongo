package com.eeb.dropwizardmongo.configuration;

import com.eeb.dropwizardmongo.factory.MongoFactory;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * This class can be used as is or extended to provide support for configuration options for your dropwizard-mongo
 * application.
 */
public class DropwizardMongoConfiguration extends Configuration {


    @Valid
    @NotNull
    private MongoFactory mongoFactory = new MongoFactory();

    @JsonCreator
    public DropwizardMongoConfiguration(@JsonProperty("mongoDB") MongoFactory mongoFactory) {
        this.mongoFactory = mongoFactory;
    }

    @JsonProperty("mongoDB")
    public MongoFactory getMongoFactory() {
        return this.mongoFactory;
    }


}
