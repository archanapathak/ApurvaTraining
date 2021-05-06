package corerevision;

class Animal{
	
	public void eat() {
		
		System.out.println("Dog eats pediggry ,  hen eats grass");
		
	};
	
}


class Dog extends Animal
{

//	 public void eat(String name , String food) {
//		 
//		 System.out.println(name + "eats " + food);
//	 }
	 
	 public void eat() {
			
			System.out.println("Dog eats biscuits");
			
		};
		

}




public class overridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog boso = new Dog();
	boso.eat();

	
	
	
	

}
	
}
