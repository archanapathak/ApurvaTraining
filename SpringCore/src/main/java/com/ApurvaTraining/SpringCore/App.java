package com.ApurvaTraining.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ApurvaTraining.SpringCore.DI.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context   =  new  ClassPathXmlApplicationContext("com\\ApurvaTraining\\SpringCore\\DI\\config.xml");
    	
    	Employee emp =  (Employee) context.getBean("emp3");
    	
    	System.out.println(emp);
    	
    }
}
