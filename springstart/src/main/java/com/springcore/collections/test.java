package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Employee;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1.getName());
        System.out.println(student1.getMarks());
        System.out.println(student1.getSports());
        System.out.println(student1.getActivities());
	}

}
