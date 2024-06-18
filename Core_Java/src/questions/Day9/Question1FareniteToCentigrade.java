package questions.Day9;
import java.util.Scanner;
/*
 * 
 * Q.
Write a program to convert given temperature from Fahrenheit to Centigrade.
Formula:
Formula:
C = 5/9(F-32).
C stands for Centigrade.
F stands for Fahrenheit.
 Include a function named convertToCentigrade that accepts an integer argument and returns a float that corresponds to 
 the centigrade equivalent.
 If the input is a negative number, print Invalid Input and terminate the program.
 Input and Output Format:
Input consists of a single integer.
Output consists of a floating point number that corresponds to the centigrade equivalent. 
The output is displayed correct to 2 decimal places.
Sample Input 1:
77
 Sample Output 1:
25.00
Sample Input 2:
-2345
Sample Output 2:
Invalid Input

 */
public class Question1FareniteToCentigrade {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int F=sc.nextInt();
	System.out.println(Math.round(convertToCentigrade(F)));
	
}

public static float convertToCentigrade(int F) {
	
	if(F < 0) {
		System.out.println("Invalid Input");
		System.exit(-1);
	}
	
	/*Formula:
		C = 5/9(F-32).   */
	return ((F-32)*5)/9;
}
}
