package questions.Day2;

import java.util.Scanner;

/*
 *  1.Accept age from user and check if he/she is eligible for license or not?
 *   4.Accept a number from user and check whether it is +ve, -ve or zero

 */
public class Q1 {
	public static void main(String[] args) {
		
		System.out.println("Enter your age...");
		
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		
		if(check(age)) {
			System.out.println("Eligible for license congrats...");
		}else {
			System.out.println("NotEligible for license...");
		}
		
		
		System.out.println("------------------------------");
		
		System.out.println("Enter no to check _ve,+ve");
		int a=sc.nextInt();
		
		checkPositiveOrNegative(a);
	}
	
	public static boolean check(int age) {
		return age>=18;
	}
	
	public static void checkPositiveOrNegative(int a) {
		
		if(a > 0) {
			System.out.println("Positive");
		}else if(a<0) {
			System.out.println("Negative");
		}else {
			System.out.println("its Zero");
		}
		
	}
	

}
