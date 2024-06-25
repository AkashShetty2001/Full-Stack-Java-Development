package basics.Strings;

public class StringConstantPool {
	public static void main(String[] args) {
		String s="sachin";//scp
		s.concat("tendulker");//result heap
		s=s.concat("IND");//result heap
		s="sachinTendulker";//scp
		System.out.println(s);
	}

}
