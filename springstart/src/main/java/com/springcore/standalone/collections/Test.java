package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standalone.xml");
	    Tuition tuition1 = context.getBean("tuition1" , Tuition.class);
	    System.out.println(tuition1.getSubjects());
	    System.out.println(tuition1.getSubjects().getClass().getName());
	    System.out.println("----------------------------------------");
	    System.out.println(tuition1.getFees());
	    System.out.println(tuition1.getFees().getClass().getName());
	    System.out.println("----------------------------------------");
	    System.out.println(tuition1.getProperty());
	    System.out.println(tuition1.getProperty().getClass().getName());
	}
}
