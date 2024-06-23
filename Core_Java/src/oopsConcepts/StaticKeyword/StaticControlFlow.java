package oopsConcepts.StaticKeyword;

public class StaticControlFlow {
	public static void main(String[] args) {
		System.out.println("Inside main method");
		Control c = new Control();
		Control.disp();
		c.disp();
		c.disp1();
	}

}

class Control{
	static int a; //static variables
	static int b;
	
	
	//static block
	static {
		a=10;
		b=20;
		
	}
	
	static public void disp() {
		System.out.println("static method");
	}
	
	public void disp1() {
		System.out.println("non static method");
	}
	
	{
		System.out.println("normal java block");
	}
	
	public Control() {
		System.out.println("inside constructor");
	}
	
	
}
