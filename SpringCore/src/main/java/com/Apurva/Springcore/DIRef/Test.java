package com.Apurva.Springcore.DIRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\Apurva\\Springcore\\DIRef\\config.xml");
		
		A aobj =  (A)context.getBean("aobj");
		
		System.out.println(aobj.getX());
		
		System.out.println(aobj.getB().getY());
	}

}
