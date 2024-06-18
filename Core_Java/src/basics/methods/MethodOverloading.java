package basics.methods;

public class MethodOverloading {
public static void main(String[] args) {
	add(1,2);
	add(1,2,3);
	add(1,2,3,4);
	
	
}

public static void add(int a, int b) {
	System.out.println("m1 "+ (a+b));
}
public static void add(int a, int b,int c) {
	System.out.println("m2 "+ (+b+c));
}
public static void add(int a, int b,int c,int d) {
	System.out.println("m3 "+ (a+b+c));
}

}
