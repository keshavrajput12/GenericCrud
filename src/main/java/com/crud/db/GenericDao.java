package com.crud.db;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

//@RegisterRowMapper(UserMapper.class)
public interface GenericDao<T, K> {

//    @SqlQuery("SELECT * FROM <table_name> WHERE id = :id")
//    T findById(@Bind("id") K id);
//
//    @SqlUpdate("INSERT INTO <table_name> (id, name) VALUES (:id, :name)")
//    void insert(@BindBean T entity);

}