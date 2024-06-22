package oopsConcepts.Constructor;

/*
 * if we want some code to be executed as soon as we create
 * an object then place those statements in constructor.
 */
public class ConstructorEx2 {
	public static void main(String[] args) {
		DBConnectivity db1= new DBConnectivity();
	}

}

class DBConnectivity{
	
	public DBConnectivity() {
		System.out.println("Connection made successfully");
	}
}
