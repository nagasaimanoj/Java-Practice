package com.manoj;

public class App {
	public static void main(String[] args) {

		((HelloWorld) new org.springframework.context.support.ClassPathXmlApplicationContext("Spring-Module.xml")
				.getBean("helloBean")).printHello();
	}
}