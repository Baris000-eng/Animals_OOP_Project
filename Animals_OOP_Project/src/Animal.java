
public class Animal {
	
	private int width;
	private int height;
	private double weight;
	private int age;
	private String name;
	

	public Animal(int width, int height, double weight, int age, String name) {
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.name = name;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public void makeSound() {
		System.out.println("I make a sound !!!");
	}
	
	
	
	
	
	
	

	

}
