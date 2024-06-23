package oopsConcepts.StaticKeyword;
/*
 * imp interview Question count number of Objects created.
 */
public class CountNoOfObjects {
	public static void main(String[] args) {
		CountObjects c1= new CountObjects();
		CountObjects c2= new CountObjects();
		CountObjects c3= new CountObjects();
		CountObjects c4= new CountObjects();
		CountObjects c5= new CountObjects();
		CountObjects c6= new CountObjects();
		
		System.out.println(CountObjects.count);
	}

}

class CountObjects{
	static int count; // memory allocated once in heap and address is shared
		 				// among all objects.
	
	// it will be included by constructor
	{
		count++;
	}
	public CountObjects(){
		
	}
}
