package questions.Day8;

import java.util.Scanner;

/*
 * 	
4.
create a class called Best with the following data members and member functions.
	Data members : custName,phoneNo,number of calls, tax and bill.
	Member Functions :
	accept() : input custName, phoneNo and calls from user
	billing() : calc bill amount based on the following condition
	
		Number of calls			Rate per call(Rs)
		up to 100				nill
		next 200				0.80
		next 200				1.25
		above 500				2.50
		
The program should add 12% service tax over the bill amount to get the final bill.

 */
public class Question2OnDataMembers {
	public static void main(String[] args) {
		Best b = new Best();
		b.accept();
		b.bill();
	}

}
class Best{
	String custName;
	String phoneNo;
	int numberOfCalls;
	double tax;
	double bill;
	
	
	void accept() {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter customer name:");
		 custName=sc.next();
		 
		 System.out.println("Enter customer phoneNo:");
		 phoneNo=sc.next();
		 
		 System.out.println("Enetr no of calls");
		 numberOfCalls=sc.nextInt();
	}
	
	void bill() {
		if(numberOfCalls <= 100) {
			bill=0;
		}else if(numberOfCalls <= 300) {
			bill=(numberOfCalls-100)*(0.80);
		}else if(numberOfCalls <=500) {
			numberOfCalls-=100;
			bill=(200 * 0.80) + (200 * 1.25) + (numberOfCalls - 500) * 2.50;
		}
		
		tax=bill*0.12;
		bill+=tax;
		System.out.println("Total Bill "+bill);
	}
	
}
