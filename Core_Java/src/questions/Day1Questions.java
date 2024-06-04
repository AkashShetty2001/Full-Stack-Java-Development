package questions;
import java.util.Scanner;

/*
 * 
 *   1.Perform all Arithmetic operations
	 2.Calculate area of circle, rectangle and triangle
	 3.Calculate simple Interest
	 4.Accept marks of any 3 subjects and calculate percentage.
	 5.Calculate tax amount at 12% of salary
 */
public class Day1Questions {
	public static void main(String[] args) {
		
		AirthmeticOpetaions a= new AirthmeticOpetaions();
		a.addition(2, 2);
		a.subtraction(2, 2);
		a.multiplication(2, 2);
		a.division(2, 2);
		a.moduls(10, 3);
		
		
		System.out.println("-------------------------------------------------");
		
		
		Calculate c=new Calculate();
		c.AreaOfCircle(3);
		c.AreaOfRectangle(4,8);
		c.AreaOfTriangle(3,6);
		
		
		System.out.println("-------------------------------------------------");
		
		
		OtherQuestions oq= new OtherQuestions();
		oq.calculateSimpleIntrest(15000, 8, 3);
		
		System.out.println("-------------------------------------------------");
		
		oq.percentage();
		
		System.out.println("-------------------------------------------------");
		
		oq.taxAmount();
		
		
		
	}
	
	

}

class AirthmeticOpetaions extends Day1Questions{
	
	public static void addition(int a,int b) {
		System.out.println("addtion:"+a+b);
	}
	
	public static void subtraction(int a,int b) {
		System.out.println("subtraction:"+(a-b));
	}
	
	public static void multiplication(int a,int b) {
		System.out.println("multiplication:"+a*b);
	}
	
	public static void division(int a,int b) {
		System.out.println("division:"+a/b);
	}
	
	public static void moduls(int a,int b) {
		System.out.println("modulus:"+a%b);
	}
}

class Calculate extends Day1Questions{
	
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

	
}

class OtherQuestions extends Day1Questions{
	  static Scanner sc= new Scanner(System.in);
	public static void calculateSimpleIntrest(int principal,int rateOfInterest,int timePeriod) {
		System.out.println("simpleInterest:"+((principal*rateOfInterest*timePeriod)/100));
		
		}
	
	public static void percentage() {
		//Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no of subjects:");
		int n=sc.nextInt();
		
		System.out.println("Enter marks for Maths:");
		int maths=sc.nextInt();
		
		System.out.println("Enter marks for Science:");
		int science=sc.nextInt();
		
		System.out.println("Enter marks for socialScience:");
		int socialScience=sc.nextInt();
		
		double totalObtained=maths+science+socialScience;
		double possibleMarks=n*100;
		
		double result=((totalObtained/possibleMarks)*100);
		System.out.println("Result:"+result+"%");
	}
	
	public static void taxAmount() {
		double percent=12.0/100;
		//System.out.println(percent);
		
		//Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your gross_salary:");
		double salary=sc.nextDouble();
		
		System.out.println("taxamount:"+salary * percent);
	}
}
