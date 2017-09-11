package com.gnsmk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("Spring-Module.xml");
    }

    public void setObj(HelloWorld h) {
        System.out.println(h);
    }
}