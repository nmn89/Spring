package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Entities.Employee;
import com.spring.jdbc.dao.EmployeeDao;

public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
         EmployeeDao empDao = context.getBean("empDao",EmployeeDao.class);
//         
//           //INSERT
//         Employee emp = new Employee();
//         emp.setId(103);
//         emp.setName("Dilip Kakkar");
//         emp.setCity("Chennai");
//         
//         int result = empDao.insert(emp);
//         System.out.println(result + "Records added");
           
           //UPDATE
//         Employee emp = new Employee();
//         emp.setId(103);
//         emp.setName("Chitra Gupta");
//         emp.setCity("Patna");
//         int result = empDao.change(emp);
//         System.out.println(result + "Data Change");
        
           //DELETE
//         int result = empDao.delete(103);
//         System.out.println(result + "records deleted");
         
//         Employee emp=empDao.getEmployee(101);
//         System.out.println(emp);
         
         List<Employee> emp=empDao.getAllEmployees();
         for(Employee e:emp) {
        	 System.out.println(e);
         }
    }
}