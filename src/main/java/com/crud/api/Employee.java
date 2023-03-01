package com.crud.api;

import lombok.Data;

@Data
public class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;

    public Employee(int id,String name,String email,double salary){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
    }
    public Employee(){
    }
}