package com.Apurva.Springcore.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Apurva.Springcore.Collection.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\Apurva\\Springcore\\Lifecycle\\config.xml");
		
		Pendrive pendrive =  (Pendrive)context.getBean("pendrive");
		
		System.out.println(pendrive);
		
		context.registerShutdownHook();
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		Usbport usport = (Usbport) context.getBean("usbport");
		System.out.println(usport);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
		Harddisk harddisk = (Harddisk)context.getBean("harddisk");
		
		System.out.println(harddisk);
	}

}