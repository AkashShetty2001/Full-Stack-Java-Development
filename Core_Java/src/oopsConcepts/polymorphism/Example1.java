package oopsConcepts.polymorphism;

public class Example1 {
	public static void main(String[] args) {
		Animal ref= new Dog();
		ref.sound();
		ref.display();
		((Dog)ref).barks();
	}

}

class Animal{
	public  void  sound() {
		System.out.println("Animal class");
	}
	public  void display() {
		System.out.println("Inside Animal class");
		
	}
}
class Dog extends Animal{
	
	public  void display() {
		System.out.println("Inside Dog class");//overridden method
	}
	public  void barks() {
		System.out.println("Dog barks");
	}
}
