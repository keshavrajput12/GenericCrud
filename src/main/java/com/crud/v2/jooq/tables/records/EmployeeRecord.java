/*
 * This file is generated by jOOQ.
 */
package com.crud.v2.jooq.tables.records;


import com.crud.v2.jooq.tables.Employee;
import com.crud.v2.jooq.tables.interfaces.IEmployee;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeRecord extends UpdatableRecordImpl<EmployeeRecord> implements Record4<Long, String, String, Double>, IEmployee {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>homestead.EMPLOYEE.ID</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>homestead.EMPLOYEE.ID</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>homestead.EMPLOYEE.NAME</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>homestead.EMPLOYEE.NAME</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>homestead.EMPLOYEE.EMAIL</code>.
     */
    @Override
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>homestead.EMPLOYEE.EMAIL</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>homestead.EMPLOYEE.SALARY</code>.
     */
    @Override
    public void setSalary(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>homestead.EMPLOYEE.SALARY</code>.
     */
    @Override
    public Double getSalary() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Employee.EMPLOYEE.ID;
    }

    @Override
    public Field<String> field2() {
        return Employee.EMPLOYEE.NAME;
    }

    @Override
    public Field<String> field3() {
        return Employee.EMPLOYEE.EMAIL;
    }

    @Override
    public Field<Double> field4() {
        return Employee.EMPLOYEE.SALARY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public Double component4() {
        return getSalary();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public Double value4() {
        return getSalary();
    }

    @Override
    public EmployeeRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public EmployeeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public EmployeeRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public EmployeeRecord value4(Double value) {
        setSalary(value);
        return this;
    }

    @Override
    public EmployeeRecord values(Long value1, String value2, String value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEmployee from) {
        setId(from.getId());
        setName(from.getName());
        setEmail(from.getEmail());
        setSalary(from.getSalary());
    }

    @Override
    public <E extends IEmployee> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeRecord
     */
    public EmployeeRecord() {
        super(Employee.EMPLOYEE);
    }

    /**
     * Create a detached, initialised EmployeeRecord
     */
    public EmployeeRecord(Long id, String name, String email, Double salary) {
        super(Employee.EMPLOYEE);

        setId(id);
        setName(name);
        setEmail(email);
        setSalary(salary);
    }

    /**
     * Create a detached, initialised EmployeeRecord
     */
    public EmployeeRecord(com.crud.v2.jooq.tables.pojos.Employee value) {
        super(Employee.EMPLOYEE);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setEmail(value.getEmail());
            setSalary(value.getSalary());
        }
    }
}
