package oopsConcepts.polymorphism;

public class Main {
	public static void main(String args[]) {
		Person person= new Person();
		
		Ram ram = new Ram();
		ram.doWork(person);
		//person.showDetails();
		
	}

}
