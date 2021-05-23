package com.Apurva.Springcore.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Harddisk {
	
	private String  Brand;

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public Harddisk(String brand) {
		super();
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Harddisk [Brand=" + Brand + "]";
	}

	public Harddisk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting harddisk bean");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("stopping harddisk beans");
	}
	

}
