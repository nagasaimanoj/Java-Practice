package com.gnsmk;

public class App {
    public static void main(String[] args) {
        org.springframework.context.support.ClassPathXmlApplicationContext cc = new org.springframework.context.support.ClassPathXmlApplicationContext("Spring-Module.xml");
        System.out.println(cc.getBean("helloBean1")+"\n"+cc.getBean("helloBean2")+"\n"+cc.getBean("helloBean3"));
    }
}