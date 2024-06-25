package oopsConcepts.StaticKeyword;

class Demo
{
	static int a;
	static int b;
	
	static 
	{
		System.out.println(" Insdie Static block");
		a=10;
		b=20;
		System.out.println("-------------");
	
	}
	static void disp()
	{
		System.out.println(" Inside disp() Static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------");
	}
	int x;
	int y;
	
	{
		x=10;
		y=20;
		System.out.println("Java block");
		System.out.println("----------------");
	}
	Demo()
	{
		
		System.out.println("Inside Constructor");
		System.out.println("-------------");
	}
	void disp1()
	{
		System.out.println("Non static disp1() method");
		System.out.println(x);
		System.out.println(y);
		System.out.println("----------------------");
		
	}
	void disp2()
	{
		disp1();
	}
}

public class StaticEx2 {

	public static void main(String[] args) {
	
		
		Demo.disp();
		Demo d=new Demo();
		d.disp();
		d.disp1();
		

	}

}

