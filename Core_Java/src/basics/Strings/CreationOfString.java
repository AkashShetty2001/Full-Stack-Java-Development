package basics.Strings;

public class CreationOfString {
	public static void main(String[] args) {
		
		
		//immutable String
		String s=new String("Akash");
		String s1="Akash";
		
		
		System.out.println(s==s1);// reference checking
		System.out.println(s.equals(s1));//content checking 
		
		
		//mutable String
		StringBuffer sb= new StringBuffer("Akash");
		StringBuffer sb1=new StringBuffer(s);  //1.0v
		
		System.out.println(sb==sb1);// reference checking
		System.out.println(sb.equals(sb1));//reference checking 
		
		
		StringBuilder sd= new StringBuilder("Akash");
		StringBuilder sd1=new StringBuilder(s);  //1.5v
		
		System.out.println(sd==sd1);// reference checking
		System.out.println(sd.equals(sd1));//reference checking 
		
		
		
		
		
	}

}
