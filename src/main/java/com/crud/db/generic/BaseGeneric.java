package com.crud.db.generic;

import lombok.var;
import org.jdbi.v3.core.Jdbi;
import java.util.List;

public class BaseGeneric<T> {

    private final Jdbi jdbi;
    private final Class<T> type;
    private final String tableName;

    public BaseGeneric(Jdbi jdbi, Class<T> type, String tableName) {
        this.jdbi = jdbi;
        this.type = type;
        this.tableName = tableName;
    }

    public List<T> getAll() {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM " + tableName)
                        .mapToBean(type)
                        .list()
        );
    }

    public T getById(int id) {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM " + tableName + " WHERE id = :id")
                        .bind("id", id)
                        .mapToBean(type)
                        .findFirst()
                        .orElse(null)
        );
    }

    public int create(T entity) {
        return jdbi.withHandle(handle -> {
            String sql = "INSERT INTO " + tableName + " (";
            String values = "VALUES (";
            for (var field : type.getDeclaredFields()) {
                sql += field.getName() + ", ";
                values += ":" + field.getName() + ", ";
            }
            sql = sql.substring(0, sql.length() - 2) + ")";
            values = values.substring(0, values.length() - 2) + ")";
            String fullSql = sql + " " + values;
            return handle.createUpdate(fullSql)
                    .bindBean(entity)
                    .execute();
        });
    }

    public int update(T entity) {
        return jdbi.withHandle(handle -> {
            String sql = "UPDATE " + tableName + " SET ";
            for (var field : type.getDeclaredFields()) {
                sql += field.getName() + " = :" + field.getName() + ", ";
            }
            sql = sql.substring(0, sql.length() - 2) + " WHERE id = :id";
            return handle.createUpdate(sql)
                    .bindBean(entity)
                    .execute();
        });
    }

    public int updateById(T entity, String id) {
        return jdbi.withHandle(handle -> {
            String sql = "UPDATE " + tableName + " SET ";
            for (var field : type.getDeclaredFields()) {
                sql += field.getName() + " = :" + field.getName() + ", ";
            }
            sql = sql.substring(0, sql.length() - 2) + " WHERE " + id + " = :" + id;
            return handle.createUpdate(sql)
                    .bindBean(entity)
                    .execute();
        });
    }

    public int delete(int id) {
        return jdbi.withHandle(handle ->
                handle.createUpdate("DELETE FROM " + tableName + " WHERE id = :id")
                        .bind("id", id)
                        .execute()
        );
    }
}
