-- liquibase formatted sql
-- changeset keshav_dropwizard_crud:1.0.0
 CREATE TABLE USER (
        ID BIGINT NOT NULL AUTO_INCREMENT,
        NAME varchar(255) DEFAULT NULL,
        EMAIL varchar(255) DEFAULT NULL,
        PRIMARY KEY (ID)
      );

