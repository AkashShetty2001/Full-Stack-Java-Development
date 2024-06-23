package oopsConcepts.StaticKeyword;

/*
 * static elements are object independent
 */
public class StaticEx1 {
public static void main(String[] args) {
	System.out.println(Example.a);
	System.out.println(Example.b);
}
}

class Example{
	static int a;
	static int b;
	
	static {
		a=10;
		b=20;
	}
}
