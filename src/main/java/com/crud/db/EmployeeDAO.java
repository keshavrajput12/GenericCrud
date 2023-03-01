package com.crud.db;

import com.crud.db.mappers.EmployeeMapper;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

@RegisterRowMapper(EmployeeMapper.class)
public interface EmployeeDAO {
//    @SqlQuery("SELECT * FROM EMPLOYEE")
//    List<EmployeeDTO> getEmployees();
//
//    @SqlQuery("SELECT * FROM EMPLOYEE WHERE ID = :id")
//    EmployeeDTO getEmployeeById(@Bind("id") long id);
//
//    @SqlUpdate("INSERT INTO EMPLOYEE (NAME, EMAIL,SALARY) VALUES (:name, :email,:salary)")
//    @GetGeneratedKeys
//    long createEmployee(@BindBean EmployeeDTO user);
//
//    @SqlUpdate("UPDATE EMPLOYEE SET NAME = :name, EMAIL = :email WHERE ID = :id")
//    void updateEmployee(@BindBean EmployeeDTO user);
//
//    @SqlUpdate("DELETE FROM EMPLOYEE WHERE ID = :id")
//    void deleteEmployee(@Bind("id") long id);
}
