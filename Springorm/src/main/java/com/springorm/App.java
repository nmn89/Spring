package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.PersonDao;
import com.springorm.entities.Person;

public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	PersonDao personDao = context.getBean("personDao", PersonDao.class);
    	Person person = new Person("Aakash Singh",34,"Male");
    	String r = personDao.insert(person);
    	System.out.println("done "+r); 
    }
}