package basics.methods;


/*
 * Q. can we overload main method in java
 * ans. Yes , JVM will invoke main method which is accpecting String [] as parameter.
 */
public class Interview1 {
	public static void main(String[] args) {
		System.out.println("Actual main method");
	}
	
	public static void main(int[] args) {
		System.out.println("m2");
	}
	public static void main(float[] args) {
		System.out.println("m3");
	}

}
