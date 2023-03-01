package com.crud.db;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;



public interface UserDAO {
//    @SqlQuery("SELECT * FROM user")
//    List<UserDTO> getAllUsers();
//
//    @SqlQuery("SELECT * FROM USER WHERE ID = :id")
//    UserDTO getUserById(@Bind("id") long id);
//
//    @SqlUpdate("INSERT INTO USER (NAME, EMAIL) VALUES (:name, :email)")
//    @GetGeneratedKeys
//    long createUser(@BindBean UserDTO user);
//
//    @SqlUpdate("UPDATE USER SET NAME = :name, EMAIL = :email WHERE ID = :id")
//    void updateUser(@BindBean UserDTO user);
//
//    @SqlUpdate("DELETE FROM USER WHERE ID = :id")
//    void deleteUser(@Bind("id") long id);
}
