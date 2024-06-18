package basics.methods;

public class CreationOfMethods {
	public static void main(String[] args) {
		add(); // invoking (calling) a method.
	} 
	
	
	static void/*return type*/ add/*name*/(/*parameters*/) { // method should have  all four given components.
		int a,b,c;
		a=b=10;//body
		c=a+b;
		System.out.println(c);
	}

}
