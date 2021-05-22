package com.Apurva.Springcore.CI;

public class Addition {
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		
	}
	
	
	public Addition(double  a, double  b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		
		
	}
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	
	public int Add() {
		
		return a+b;
	}
	
	
	

}
