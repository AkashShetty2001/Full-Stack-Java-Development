package oopsConcepts.StaticKeyword;
import java.util.Scanner;

/*
 * when to use static and instance elements.
 */
public class StaticEx3 {

	public static void main(String[] args) {
		Farmer f1= new Farmer();
		Farmer f2= new Farmer();//ri is same for all so make it static.
		f1.input();
		f1.compute();
		f1.disp();
	}
}


class Farmer{
	private float pa;
	private float td;
	private float si;
	private static float ri;
	
	static {
		ri=2.5f;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pa:");
		pa=sc.nextFloat();
		System.out.println("enter td:");
		td=sc.nextFloat();
		
	}
	
	public void compute() {
		si=(pa * td * ri) / 100;
	}
	
	public void disp() {
		System.out.println(si);
	}
}
