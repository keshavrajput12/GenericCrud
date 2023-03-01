/*
 * This file is generated by jOOQ.
 */
package com.crud.v2.jooq.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDatabasechangelog extends Serializable {

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.ID</code>.
     */
    public void setId(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.ID</code>.
     */
    public String getId();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.AUTHOR</code>.
     */
    public void setAuthor(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.AUTHOR</code>.
     */
    public String getAuthor();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.FILENAME</code>.
     */
    public void setFilename(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.FILENAME</code>.
     */
    public String getFilename();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    public void setDateexecuted(LocalDateTime value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.DATEEXECUTED</code>.
     */
    public LocalDateTime getDateexecuted();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    public void setOrderexecuted(Integer value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.ORDEREXECUTED</code>.
     */
    public Integer getOrderexecuted();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.EXECTYPE</code>.
     */
    public void setExectype(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.EXECTYPE</code>.
     */
    public String getExectype();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.MD5SUM</code>.
     */
    public void setMd5sum(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.MD5SUM</code>.
     */
    public String getMd5sum();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.DESCRIPTION</code>.
     */
    public String getDescription();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.COMMENTS</code>.
     */
    public void setComments(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.COMMENTS</code>.
     */
    public String getComments();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.TAG</code>.
     */
    public void setTag(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.TAG</code>.
     */
    public String getTag();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    public void setLiquibase(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.LIQUIBASE</code>.
     */
    public String getLiquibase();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.CONTEXTS</code>.
     */
    public void setContexts(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.CONTEXTS</code>.
     */
    public String getContexts();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.LABELS</code>.
     */
    public void setLabels(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.LABELS</code>.
     */
    public String getLabels();

    /**
     * Setter for <code>homestead.DATABASECHANGELOG.DEPLOYMENT_ID</code>.
     */
    public void setDeploymentId(String value);

    /**
     * Getter for <code>homestead.DATABASECHANGELOG.DEPLOYMENT_ID</code>.
     */
    public String getDeploymentId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IDatabasechangelog
     */
    public void from(IDatabasechangelog from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IDatabasechangelog
     */
    public <E extends IDatabasechangelog> E into(E into);
}
