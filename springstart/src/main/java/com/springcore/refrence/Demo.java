package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Student;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refrence/ref.xml");
        A a = (A) context.getBean("aobj");
        System.out.println(a.getM());
        System.out.println(a.getObj().getN());
        System.out.println(a);
	}
}