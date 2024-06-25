package oopsConcepts.Inheritence;

public class InheritenceEx1 {
	public static void main(String[] args) {
	
		Demo2 d1= new Demo2();
		d1.disp();
}
}

class Demo1{
	
	String name="Akash";
	int age=23;
	
	public void disp() {
		System.out.println("Demo1 "+name+" "+age);
	}
}


class Demo2 extends Demo1{
	//Demo2 is a child of Demo1
	
	/*after compilation.
	String name="Akash";
	int age=23;
	
	public void disp() {
		System.out.println("Demo1 "+name+" "+age);
	}
	*/
}
