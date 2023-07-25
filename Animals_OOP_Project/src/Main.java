
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println();
		Animal animal = new Animal(75, 175, 100.50, 10, "Lucy");
		
		System.out.println(animal.getClass());
		System.out.println(animal.getAge());
		System.out.println(animal.getHeight());
		System.out.println(animal.getWidth());
		System.out.println(animal.getName());
		System.out.println(animal.getWeight());
		
		System.out.println();
		
		Animal lion = new Lion(95, 194, 140.50, 12, "Lea");
		
		System.out.println(lion.getClass());
		System.out.println(lion.getAge());
		System.out.println(lion.getHeight());
		System.out.println(lion.getWeight());
		System.out.println(lion.getWidth());
		System.out.println(lion.getAge());
		
		System.out.println();
		
		
        Animal bear = new Bear(85, 187, 191.50, 15, "Johnny");
		
		System.out.println(bear.getClass());
		System.out.println(bear.getAge());
		System.out.println(bear.getHeight());
		System.out.println(bear.getWeight());
		System.out.println(bear.getWidth());
		System.out.println(bear.getAge());
		
		System.out.println();
		
		
        Lion lion2 = new Lion(99, 206, 120.00, 5, "Simba");
		
		System.out.println(lion2.getClass());
		System.out.println(lion2.getAge());
		System.out.println(lion2.getHeight());
		System.out.println(lion2.getWeight());
		System.out.println(lion2.getWidth());
		System.out.println(lion2.getAge());
		
		System.out.println();
		
		
        Bear bear2 = new Bear(101, 215, 206.50, 17, "Joe");
		
		System.out.println(bear2.getClass());
		System.out.println(bear2.getAge());
		System.out.println(bear2.getHeight());
		System.out.println(bear2.getWeight());
		System.out.println(bear2.getWidth());
		System.out.println(bear2.getAge());
		
		System.out.println();
		
		
		
		
		animal.makeSound();
		lion.makeSound();
		bear.makeSound();
		lion2.makeSound();
		bear2.makeSound();
		
		System.out.println();
		
		
		
		
		
		
		

	}

}



/*public Animal(int width, int height, double weight, int age, String name) {*/