package questions.Day2;

import java.util.Scanner;

/*
 *  1.Accept age from user and check if he/she is eligible for license or not?
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
	}
	
	public static boolean check(int age) {
		return age>=18;
	}
	

}
