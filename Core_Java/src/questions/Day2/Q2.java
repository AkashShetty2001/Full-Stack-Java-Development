package questions.Day2;
import java.util.Scanner;

/*
 *  2.Accept a number from user and check whether it is even or odd number
 *   3.Accept 3 numbers from user and display greatest number
 */
public class Q2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number;");
		int number=sc.nextInt();
		checkEvenOrOdd(number);
		
		System.out.println("-------------------------------------");
		
		greatestNumber(7,11,3);
		
	}
	 public static void checkEvenOrOdd(int number) {
		 
		 if(number %2 == 0) {
			 System.out.println("Even");
		 }else {
			 System.out.println("Odd");
		 }
	 }
	 
	 public static void greatestNumber(int a, int b,int c) {
		 if(a>b) {
			 if(a>c) {
				 System.out.println("greatest:"+a);
			 }else {
				 System.out.println(c);
			 }
		 }else if(b>c) {
			 System.out.println(b);
		 }else {
			 System.out.println(c);
		 }
	 }

}
