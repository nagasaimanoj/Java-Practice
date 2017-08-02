package com.gnsmk;

import java.util.*;

public class Employee {
    String name, country, id, age;

    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setAge(String age) {
        this.age = age;
        return this;
    }

    public Employee setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return "{" + id + "::" + name + "::" + age + "::" + country + "}";
    }
}