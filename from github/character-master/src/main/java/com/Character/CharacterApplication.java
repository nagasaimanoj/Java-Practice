package com.Character;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class CharacterApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(CharacterApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	public org.springframework.boot.context.embedded.ServletRegistrationBean h2servletRegistration() {
		org.springframework.boot.context.embedded.ServletRegistrationBean registration = new org.springframework.boot.context.embedded.ServletRegistrationBean(
				new org.h2.server.web.WebServlet());
		registration.addUrlMappings("/console/*");
		return registration;
	}
}