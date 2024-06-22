package oopsConcepts.Constructor;

public class ConstructorEx1 {
	public static void main(String[] args) {
		Student1 s1= new Student1("Akaash", 23);// invoke a call to constructor
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}

class Student1{
	private String name;
	private int age;
	
	
	public Student1(String name, int age) {
		this.age=age;
		this.name=name;
		
	}
		
		
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
	//}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
}
