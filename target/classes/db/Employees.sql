-- liquibase formatted sql
-- changeset keshav_dropwizard_crud:1.0.0
 CREATE TABLE EMPLOYEE (
        ID BIGINT NOT NULL AUTO_INCREMENT,
        NAME varchar(255) DEFAULT NULL,
        EMAIL varchar(255) DEFAULT NULL,
        SALARY DOUBLE DEFAULT NULL,
        PRIMARY KEY (ID)
      );