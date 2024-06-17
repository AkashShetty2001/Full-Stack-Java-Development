package oopsConcepts;

class Student {
	
	//DataMembers
//	String name;
//	int rollNo;
//	int age;  // no security
//	String city;
	
	private String name;
	private int rollNo;
	private int age;  //  security
	private String city;
	
	void setName(String name) {
		this.name= name;
	}
	void setRollNo(int rollNo) {
		this.rollNo= rollNo;
	}
	void setAge(int age) {
		this.age= age;
	}
	void setCity(String city) {  //setters
		this.city= city;
	}
	
	String getName() {
		return name;   ///getters
		
	}
	
	int getRollNo() {
		return rollNo;
	}
	
	int getAge() {
		return age;
	}
	
	String getCity() {
		return city;
	}
	
	
}
public class Encapsulation1 {
	
	public static void main(String[] args) {
		
		Student s1= new Student();
		//System.out.println(s1.name); // direct access
		s1.setName("Akash");    //controlled access to data members of class Student
		s1.setRollNo(400);
		s1.setAge(23);
		s1.setCity("Bengaluru");
		
		
		
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());
		System.out.println(s1.getAge());
		System.out.println(s1.getCity());
		
	}

}


