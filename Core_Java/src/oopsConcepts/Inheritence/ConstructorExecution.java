package oopsConcepts.Inheritence;
class Parent{
	int a,b;
	
	Parent(){
		a=10;b=20;
		System.out.println("inside parent class constructor");
	}
	
	Parent(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("Inside parent parameterized constructor");
	}
}

class Child extends Parent{
	int x,y;
	
	Child(){
		x=100;
		y=200;
	}
	
	Child(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
}
public class ConstructorExecution {

	public static void main(String[] args) {
//		Child ch1 = new Child();
//		ch1.disp();
		
		Child ch2 = new Child(1000,2000);
		ch2.disp();
	}
}
