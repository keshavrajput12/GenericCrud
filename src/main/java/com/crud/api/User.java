package com.crud.api;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String email;

    // Constructor, getters, setters
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
    }
}