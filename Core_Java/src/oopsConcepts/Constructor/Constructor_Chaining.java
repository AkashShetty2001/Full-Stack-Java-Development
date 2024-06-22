package oopsConcepts.Constructor;

public class Constructor_Chaining {

	public static void main(String[] args) {
		//Animal a= new Animal();
		//System.out.println(a);
		
		Dog d = new Dog();
	}
}

class Animal{
	private String name;
	private String cost;
	
	public Animal() {
		super();
		System.out.println("Inside Animal class Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
}

class Dog extends Animal{
	
	public Dog(){
		this(2);
		System.out.println("Insid Dog Zero parameterized constructor");
	}
	
	public Dog(int a) {
		System.out.println("Insid Dog one parameterized constructor");
	}
}
