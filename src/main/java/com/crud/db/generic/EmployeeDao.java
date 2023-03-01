package com.crud.db.generic;

import com.crud.api.Employee;
import org.jdbi.v3.core.Jdbi;

public class EmployeeDao extends BaseGeneric<Employee> {

    public EmployeeDao(Jdbi jdbi) {
        super(jdbi, Employee.class, "employee");
    }
}