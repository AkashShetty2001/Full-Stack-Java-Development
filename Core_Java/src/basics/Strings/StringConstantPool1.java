package basics.Strings;

public class StringConstantPool1 {
	public static void main(String args[]) {
		
		String s1= new String("y c c m!");
		String s2= new String("y c c m!");
		System.out.println(s1==s2);
		
		String s3="y c c m!";
		System.out.println(s1==s3);
		String s4="y c c m!";
		System.out.println(s4==s3);
		
		String s5="y c"+" c m!";// compiler involvement
		System.out.println(s3==s5);
		
		String s6="y c";
		String s7=s6+" c m!";
		System.out.println(s3==s7);// Jvm Involvemnt
		
		
		final String s8="y c";
		String s9=s8+" c m!";
		System.out.println(s3==s9);
		
		
		
	
	}

}
