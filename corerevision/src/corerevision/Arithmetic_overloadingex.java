package corerevision;

class Arithmetic
{
	
	public int add(int x, int y) {
		
		int z = x+y;
		
		return z;
		
		// return (x+y);
		
	}
	
public double  add(int x, double y) {
		
		double  z = x+y;
		
		return z;
		
		// return (x+y);
		
	}
	
	
}


public class Arithmetic_overloadingex {

	public Arithmetic_overloadingex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Arithmetic arith = new Arithmetic();
	System.out.println("add  " +arith.add(20, 30));
	
	double resx = arith.add(40, 40d);
	
	}

}
