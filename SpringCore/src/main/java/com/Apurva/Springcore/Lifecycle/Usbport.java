package com.Apurva.Springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Usbport  implements InitializingBean , DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Usbport(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Usbport [price=" + price + "]";
	}

	public Usbport() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("intialising property for beans");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	
		
		System.out.println("destroying");
	}
	
	

}
