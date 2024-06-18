package basics.Arrays;

public class Array4 {
	public static void main(String[] args) {
		byte a=1;
		int b=2;   // accepeted
		short c=3;
		char d ='a';
		int f[]=new int[d];
		System.out.println(f.length);
		
		
		
		long l=1l;
		float F= 2f;//not accpected
		double D=3d;
		//int x[]= new int[D];
		
		
		System.out.println(f.getClass().getName());
		
	}

}
