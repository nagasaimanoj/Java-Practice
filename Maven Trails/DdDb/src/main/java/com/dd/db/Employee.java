package com.dd.db;

import java.util.*;
import java.lang.*;

public class Employee {
    String name, phone, age;

    public Employee setPhone(String temp) {
        phone = temp;
        return this;
    }

    public Employee setName(String temp) {
        name = temp;
        return this;
    }

    public Employee setAge(String temp) {
        age = temp;
        return this;
    }

    @Override
    public String toString() {
        return "{" + name + "::" + age + "::" + phone + "}";
    }
}