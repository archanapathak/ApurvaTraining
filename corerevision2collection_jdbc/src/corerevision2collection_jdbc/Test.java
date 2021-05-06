package corerevision2collection_jdbc;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	
	
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(111, "Archana");
		Student s2 = new Student(113, "Apurva");
		
		ArrayList<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(s1);
		studentlist.add(s2);
		
		
		 for (Student student : studentlist) {
			 
			 System.out.println(student);
			
		}
		
		
		
		
		
	Iterator itr = studentlist.iterator();
	
		while (itr.hasNext())
		{
			 System.out.println((Student)itr.next());
		  
		}
		
		
	}

}
