package com.gnsmk;

public class HelloWorld {
    private String name;

    public void setName(String temp) {
        this.name = temp;
    }

    public String toString() {
        return "Hello " + this.name;
    }
}