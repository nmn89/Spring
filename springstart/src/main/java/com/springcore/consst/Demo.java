package com.springcore.consst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/consst/constconfig.xml");
        Multiply multi = (Multiply) context.getBean("multi");
        multi.Mul();
	}

}
