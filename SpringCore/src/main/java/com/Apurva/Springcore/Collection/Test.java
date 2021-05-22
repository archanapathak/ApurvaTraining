package com.Apurva.Springcore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\Apurva\\Springcore\\Collection\\config.xml");
		
		Employee emp =  (Employee)context.getBean("emp");
		
		System.out.println(emp);
	}

}
