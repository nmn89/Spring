package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/stereoconfig.xml");
	    Person person = context.getBean("obj" , Person.class);
	    System.out.println(person);
	    
	}
}
