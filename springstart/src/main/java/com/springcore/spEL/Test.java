package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/spEL/spelconfig.xml");
	    Demo d = context.getBean("demo" , Demo.class);
	    System.out.println(d);
	    
	    
	    //This is rarely used
	    SpelExpressionParser temp = new SpelExpressionParser();
	    Expression express = temp.parseExpression("25+75");
	    System.out.println(express.getValue());
	    
	}

}
