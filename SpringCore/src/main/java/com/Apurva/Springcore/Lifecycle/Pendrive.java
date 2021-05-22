package com.Apurva.Springcore.Lifecycle;

public class Pendrive {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("inside setter method");
		this.price = price;
	}
	
	
	
	public Pendrive() {
		// TODO Auto-generated constructor stub
		
		System.out.println("inside constructor");
	}

	public Pendrive(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pendrive [price=" + price + "]";
	}
	
	
	public void Init() {
		
		System.out.println("bean is initialised");
		
	}
	
	public void destroy() {
		System.out.println(" bean is in destroy state");
	}
	
	

}
