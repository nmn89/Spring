package com.springcore.annotate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ComponentScan can be removed
@Configuration
@ComponentScan(basePackages = "com.springcore.annotate") 
public class Javaconfig {
	
	@Bean
	public Info getInfo() {
		Info info=new Info();
		return info;
	}
	
	@Bean(name= {"temp","main"})
	 public Person getPerson() {
		 Person person=new Person(getInfo());
		 return person;
	 }
}
