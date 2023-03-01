package com.crud.db.mappers;

import com.crud.api.Employee;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee map(ResultSet rs, StatementContext ctx) throws SQLException {
        return null;
    }
//    public Employee map(ResultSet resultSet, StatementContext statementContext) throws SQLException {
//        int id = resultSet.getInt("ID");
//        String name = resultSet.getString("NAME");
//        String email = resultSet.getString("EMAIL");
//        double salary = resultSet.getDouble("SALARY");
//        return new Employee(id, name, email,salary);
//    }
}
