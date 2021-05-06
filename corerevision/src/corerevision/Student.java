package corerevision;

public class Student {

	//class or instance or global  variable 
	private int id;
	private String name;
	private double percentage;
	
	
	public void display()
	{
		
		System.out.println("student details ");
		System.out.println("Id" + "  " + id + "  " + "name " + name  + "  " +  "percentage" +  percentage );
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public Student() {
		
	}

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
	
	
}
