package com.Apurva.Springcore.Collection;

import java.util.*;

public class Employee {
	
	private String empname;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String , String> courses;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}
	
	
	
	
	

}
