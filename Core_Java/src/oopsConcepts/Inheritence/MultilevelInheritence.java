package oopsConcepts.Inheritence;


/*
 * Multilevel inheritance is allowed in java
 */
public class MultilevelInheritence {
public static void main(String[] args) {
	C c1 = new C();
	c1.disp();
	
}
}

class A{
	void disp() {
		System.out.println("Inside class A");
	}
}

class B extends A{
	
}

class C extends B{
	
}