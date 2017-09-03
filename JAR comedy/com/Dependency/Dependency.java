package com.Dependency;

public class Dependency {
    private int i;

    public Dependency setI(int temp) {
        this.i = temp;
        return this;
    }

    public Dependency() {
    }

    public String toString() {
        return "value of I is.., " + this.i;
    }
}