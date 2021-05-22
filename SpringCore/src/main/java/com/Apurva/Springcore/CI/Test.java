package com.Apurva.Springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ApurvaTraining.SpringCore.DI.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
ApplicationContext context   =  new  ClassPathXmlApplicationContext("com\\Apurva\\Springcore\\CI\\config.xml");
    	
    	Addition add =  (Addition) context.getBean("add");
    	
    	System.out.println(add);
    	
    	System.out.println("addition is "+add.Add());
	}

}
