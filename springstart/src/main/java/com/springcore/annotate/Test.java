package com.springcore.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
	    Person person = context.getBean("main" , Person.class);
	    System.out.println(person);
	    person.per();
	}

}
