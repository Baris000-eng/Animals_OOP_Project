
public class Lion extends Animal implements Animals{

	public Lion(int width, int height, double weight, int age, String name) {
		// TODO Auto-generated constructor stub
		super(width, height, weight, age, name);
	}
	
	
	
	@Override
	public void makeSound() {
		System.out.println("Roarrrrrrr !!!!!");
	}



	@Override
	public void walk() {
		System.out.println("I am good at walking.");
		
	}




	@Override
	public void run() {
		System.out.println("I can run pretty fast.");
		
	}








	@Override
	public void jump() {
		System.out.println("I can jump a bit.");
		
	}

}
