/*
 * This file is generated by jOOQ.
 */
package com.crud.v2.jooq.tables;


import com.crud.v2.jooq.Homestead;
import com.crud.v2.jooq.Keys;
import com.crud.v2.jooq.tables.records.EmployeeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>homestead.EMPLOYEE</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>homestead.EMPLOYEE.ID</code>.
     */
    public final TableField<EmployeeRecord, Long> ID = createField(DSL.name("ID"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>homestead.EMPLOYEE.NAME</code>.
     */
    public final TableField<EmployeeRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>homestead.EMPLOYEE.EMAIL</code>.
     */
    public final TableField<EmployeeRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>homestead.EMPLOYEE.SALARY</code>.
     */
    public final TableField<EmployeeRecord, Double> SALARY = createField(DSL.name("SALARY"), SQLDataType.DOUBLE, this, "");

    private Employee(Name alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employee(Name alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>homestead.EMPLOYEE</code> table reference
     */
    public Employee(String alias) {
        this(DSL.name(alias), EMPLOYEE);
    }

    /**
     * Create an aliased <code>homestead.EMPLOYEE</code> table reference
     */
    public Employee(Name alias) {
        this(alias, EMPLOYEE);
    }

    /**
     * Create a <code>homestead.EMPLOYEE</code> table reference
     */
    public Employee() {
        this(DSL.name("EMPLOYEE"), null);
    }

    public <O extends Record> Employee(Table<O> child, ForeignKey<O, EmployeeRecord> key) {
        super(child, key, EMPLOYEE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Homestead.HOMESTEAD;
    }

    @Override
    public Identity<EmployeeRecord, Long> getIdentity() {
        return (Identity<EmployeeRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<EmployeeRecord> getPrimaryKey() {
        return Keys.KEY_EMPLOYEE_PRIMARY;
    }

    @Override
    public Employee as(String alias) {
        return new Employee(DSL.name(alias), this);
    }

    @Override
    public Employee as(Name alias) {
        return new Employee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(String name) {
        return new Employee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(Name name) {
        return new Employee(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}