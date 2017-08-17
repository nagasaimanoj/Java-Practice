package com.manoj;

class App {
	public static void main(String[] args) {

		((HelloWorld) new org.springframework.beans.factory.xml.XmlBeanFactory(
				new org.springframework.core.io.ClassPathResource("Spring-Module.xml")).getBean("helloBean1"))
						.printHello();
	}
}