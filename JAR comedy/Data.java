package com.data;

public class Data {
    private int i;

    public Data() {
    }

    public Data setI(int temp) {
        this.i = temp;
        return this;
    }

    public String toString() {
        return "value is.., " + this.i;
    }
}