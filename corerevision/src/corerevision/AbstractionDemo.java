package corerevision;

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	System.out.println("drawing a rectangle");
	}
	
}


class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("drawing a circle");
		
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape  anonymousshape = new Rectangle();
		
		anonymousshape.draw();
		
		anonymousshape.sayHi();
		
		
		
	}

}
