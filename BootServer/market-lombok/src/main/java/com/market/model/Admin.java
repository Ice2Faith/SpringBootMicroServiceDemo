package com.market.model;

import lombok.Data;

@Data
public class Admin {
    private int id;
    private String name;
    private double salary;

    public Admin(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
