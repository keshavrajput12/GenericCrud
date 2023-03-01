package com.crud.db.mappers;

import com.crud.api.User;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User>  {
    @Override
    public User map(ResultSet rs, StatementContext ctx) throws SQLException {
        return null;
    }
//    @Override
//    public User map(ResultSet resultSet, StatementContext statementContext) throws SQLException {
//        int id = resultSet.getInt("ID");
//        String name = resultSet.getString("NAME");
//        String email = resultSet.getString("EMAIL");
//        return new User(id, name, email);
//    }
}
