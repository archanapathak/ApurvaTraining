package corerevision;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s = new Student();
	s.setId(14456);
	s.setName("Apurva kulkarni");
	s.setPercentage(99);
	s.display();
	
	
	
	//use of constructor
	
	
	Student archana = new Student(34456, "Archana Pathak", 92);
	
     System.out.println("student details are   " +archana);
	}

}
