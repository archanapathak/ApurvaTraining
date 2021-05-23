package com.Apurva.Springcore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Apurva.Springcore.DIRef.A;

public class Test {
	
	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("com\\Apurva\\Springcore\\Autowire\\config.xml");
		
		Employee emp =(Employee)context.getBean("employee");
		System.out.println(emp);
	
	}

}
