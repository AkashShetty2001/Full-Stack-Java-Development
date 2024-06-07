package questions.Day3;
import java.util.Scanner;

/*
 * 
 * 1. Enter 2 numbers:
 
 Enter your choice.
 + for add
 - for sub
 * for mul
 / for div
 
 2.Enter your choice.
 	type 'circle' to calculate area of circle
 	type 'rect' to calculate area of rectangle
 	type 'tri' to calculate area of triangle
 	
 3.Accept any character from user and check whether it is vowel and consonant.
 */
public class switchQuestions {

	static Scanner  sc = new Scanner(System.in);
	public static void main(String[] args) {
		Q1();
		Q2();
		Q3();
	}
	
	public static void Q1() {
		
		System.out.println("Enter 1st no.") ;
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd no.") ;
		int n2=sc.nextInt();
		
		System.out.println("Enter your choice."
				+ " 1.add "
				+ "2.sub "
				+ "3.mul "
				+ "4.div "
				+ "5.mol ");
		String choice=sc.next();
		
		
		switch(choice) {
		case "add": System.out.println(n1+n2);
		break;
		case "sub": System.out.println(n1-n2);
		break;
		case "mul": System.out.println(n1*n2);
		break;
		case "div": System.out.println(n1/n2);
		break;
		case "mol": System.out.println(n1%n2);
		break;
		default : System.out.println("Invalid case");
		}	
		
	}
	
	public static void Q2() {
		System.out.println("Enetr ch"+
						" cir rect tri ");
		String ch=sc.next();
		
		switch(ch) {
		case "cir" : AreaOfCircle(2);
		break;
		case "rect" : AreaOfRectangle(2,2);
		break;
		case "tri" : AreaOfTriangle(2,2);
		break;
		default: System.out.println("Invalid choice");
		}
		
	}
	public static void AreaOfCircle(int radius) {
		double pi=3.14;
		//System.out.println(pi*(radius*radius));
		
		System.out.println("areaOfCircle:"+Math.PI*Math.pow(radius, 2));
		
	}
	
	public static void AreaOfRectangle(int length,int breadth) {
		
		/*Formula:
		 * area=length*breadth 
		 */

		
		System.out.println("areaOfRectangle:"+length*breadth);
		
	}
	
	public static void AreaOfTriangle(int base,int height) {
	
		/*
		 * 1/2 * base* height
		 */
		double half=0.5;
		System.out.println("areaOfTriangle:"+half*base*height);
		
	}
	
	public static void Q3() {
		System.out.println("Enter a character to check.");
		String ch=sc.next();
		char c=ch.charAt(0);
		
		switch(c) {
		 case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
             System.out.println(ch + " is a vowel.");
             break;
         default:
             System.out.println(ch + " is not a vowel.");
		}
	}
	
	
}
