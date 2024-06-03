package basics;

public class AboutMainMethod {
	
	//main method syntax.
	
	/*
	 *  public: It is an access specifier. We should use the public keyword to let the JVM know
 main() presence in the class(increasing the visibility of the main method).
 static : static keyword is used to make the main() method static then jvm will call the method
 without creating the object.
 
 (static methods can be called without creating objects – More can be discussed in static
 keyword concept)
 
 void : Every method has the return type in Java. void keyword is used to inform the compiler
 that the main() method does not return any value.
 
 main: It is the name of the main method in java. JVM will start the program execution from
 the main method as it is predefined for JVM hence It must be main and cannot be changed.
	 */
	
	public static void main(String args[]) {
		System.out.println("Hello! I am learning Java");
	}
	

}
