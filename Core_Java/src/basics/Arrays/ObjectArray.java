package basics.Arrays;

public class ObjectArray {
	public static void main(String[] args) {
		
		Student[] s = new Student[3]; // object array
		s[0]=new Student();
		s[1]=new Student();
		s[2]=new Student();
		
		System.out.println(s[0].name);
		System.out.println(s[1].age);
		
		s[0].name="Akash";
		s[0].age=23;
		
		s[1].name="Vijeth";
		s[1].age=23;
		
		System.out.println(s[0].name);
		System.out.println(s[1].name);
		
		Student s1= new Student();
		System.out.println(s1.getClass().getName());
		
		
	}

}

class Student{
	String name;
	int age;
	
}
