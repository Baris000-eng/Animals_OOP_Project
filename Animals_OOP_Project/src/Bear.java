
public class Bear extends Animal implements Animals{

	public Bear(int width, int height, double weight, int age, String name) {
		// TODO Auto-generated constructor stub
		
		///Retrieving the constructor from the super class.
		super(width, height, weight, age, name);
	}
	
	
	
	
	//Method overriding example
	@Override
	public void makeSound() {
		System.out.println("Woooooooooo");
	}




	@Override
	public void walk() {
		System.out.println("I walk very slowly");
		
	}




	@Override
	public void run() {
		System.out.println("However, I can run pretty fast");
		
	}




	@Override
	public void jump() {
		System.out.println("I am bad at jumping");
		
	}

	
	
	
	
	
	
	
	

}
