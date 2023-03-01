/*
 * This file is generated by jOOQ.
 */
package com.crud.v2.jooq.tables.daos;


import com.crud.v2.jooq.tables.Databasechangeloglock;
import com.crud.v2.jooq.tables.records.DatabasechangeloglockRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabasechangeloglockDao extends DAOImpl<DatabasechangeloglockRecord, com.crud.v2.jooq.tables.pojos.Databasechangeloglock, Integer> {

    /**
     * Create a new DatabasechangeloglockDao without any configuration
     */
    public DatabasechangeloglockDao() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, com.crud.v2.jooq.tables.pojos.Databasechangeloglock.class);
    }

    /**
     * Create a new DatabasechangeloglockDao with an attached configuration
     */
    public DatabasechangeloglockDao(Configuration configuration) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, com.crud.v2.jooq.tables.pojos.Databasechangeloglock.class, configuration);
    }

    @Override
    public Integer getId(com.crud.v2.jooq.tables.pojos.Databasechangeloglock object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchById(Integer... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.crud.v2.jooq.tables.pojos.Databasechangeloglock fetchOneById(Integer value) {
        return fetchOne(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, value);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public Optional<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchOptionalById(Integer value) {
        return fetchOptional(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, value);
    }

    /**
     * Fetch records that have <code>LOCKED BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchRangeOfLocked(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LOCKED IN (values)</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchByLocked(Boolean... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED, values);
    }

    /**
     * Fetch records that have <code>LOCKGRANTED BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchRangeOfLockgranted(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LOCKGRANTED IN (values)</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchByLockgranted(LocalDateTime... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED, values);
    }

    /**
     * Fetch records that have <code>LOCKEDBY BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchRangeOfLockedby(String lowerInclusive, String upperInclusive) {
        return fetchRange(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LOCKEDBY IN (values)</code>
     */
    public List<com.crud.v2.jooq.tables.pojos.Databasechangeloglock> fetchByLockedby(String... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY, values);
    }
}
