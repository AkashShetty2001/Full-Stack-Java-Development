package questions.Day8;

import java.util.Scanner;

/*
 * 3.
	create a class Employee with the following data members and member functions.
	Data members : empName,empCode, basicSalary, allowance, grossSalary, tax, netSalary
	Member Functions :
	void accept() : to input empName, empCode, basicSalary
	void allow() : to calc and store allowance as 55% of basicSalary.  
	void gross() : to calc and store grossSalary as sum of basicSalary and allowance
	void tax() : to calc and store tax as 12% of grossSalary
	void net() : to calc and store netSalary as grossSalary less tax.
	void display() : to display salary slip containing empCode, empName, basicSalary, tax and netSalary
	void main() : create an object of a class and execute all methods in logical order.

 */
public class Question1DataMembers {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.accept();
		e.allow();
		e.gross();
		e.tax();
		e.net();
		e.display();
	}

}
 class Employee{
	 
	 String empName;
	 int empCode;
	 double basicSalary ;
	 double allowance; 
	 double grossSalary; 
	 double tax;
	 double netSalary;
	 
	 void accept() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Eneter empName:");
		 empName=sc.next();
		 
		 System.out.println("Eneter empCode:");
		 empCode=sc.nextInt();
		 
		 System.out.println("Eneter basicSalary:");
		 basicSalary=sc.nextDouble();
		 
	 }
	 
	 void allow() {
		 allowance= (55 * basicSalary)/100;
		 System.out.println("Allowance is:"+allowance);
	 }
	 
	 void gross() {
		 grossSalary= allowance+basicSalary;
		 System.out.println("grossSalary is:"+grossSalary);
	 }
	 
	 void tax() {
		 tax= (12 * grossSalary)/100;
		 System.out.println("tax is:"+tax);
	 }
	 
	 void net() {
		 netSalary=grossSalary-tax;
		 System.out.println("net is:"+ netSalary);
	 }
	 
	 void display() {
		 System.out.println("Employee Salary Slip");
		 System.out.println("---------------");
		 System.out.println(empName+" "+empCode+" "+basicSalary+" "+tax+" "+netSalary);
	 }
	 
 }
