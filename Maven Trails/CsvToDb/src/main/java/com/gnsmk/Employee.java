package com.gnsmk;

<<<<<<< HEAD
=======
import java.util.*;

>>>>>>> 33b134ffcfd6c8fe383a437bb67eba133b4b2029
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

    public String toString() {
        return "{" + id + "::" + name + "::" + age + "::" + country + "}";
    }
}