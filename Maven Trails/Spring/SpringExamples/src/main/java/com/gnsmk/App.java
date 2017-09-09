package com.gnsmk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("Spring-Module.xml");

        Object o1 = cc.getBean("helloBean1");
        Object o2 = cc.getBean("helloBean2");
        Object o3 = cc.getBean("helloBean3");

        HelloWorld h1 = (HelloWorld) o1;
        HelloWorld h2 = (HelloWorld) o2;
        HelloWorld h3 = (HelloWorld) o3;

        System.out.println(o1);
        System.out.println(h2);
        System.out.println(h3);
    }
}