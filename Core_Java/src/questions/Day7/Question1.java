package questions.Day7;
import java.util.Scanner;

/*
Read the question carefully and follow the input and output format.

Karen got salary for this month and she spends 20% of her salary for food and 30% of her salary for
 travel. If she takes care of other shifts she will get 2% of the salary per day. 
 Given her salary and the number of shifts she handled. 
 Calculate how much she can save in her pocket after spending all these?

Input and Output Format :
First line of input consists of an integer, salary. Next line correspond to the number of shifts.
 Output consist of an integer, which is saving.

1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0.

Include a function named calculateSal(int salary, int shifts) whose return type is an integer,
 which is the saving.

Sample Input 1:
7000
5
Sample Output 1:
4200

Sample Input 2:
80000
Sample Output 2:
Salary too large
Sample Input 2:
6000
-1
Sample Output 2:
Shift too small

*/
public class Question1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr salary:");
		int salary=sc.nextInt();
		System.out.println("Enetr shifts:");
		int shift=sc.nextInt();
		
		double savings=(calculateSalary(salary,shift));
		if(savings != 0) {
			System.out.println("Total savings:"+savings);
		}
	}
	
	public static double calculateSalary(int salary,int shift) {
		
		if(salary > 8000) {
			System.out.println("salary is too large");
			return Integer.MIN_VALUE;
		}else if(salary < 0) {
			System.out.println("Salary is too small");
			return Integer.MIN_VALUE;
		}else if(shift < 0){
			System.out.println("shifts are less");
			return Integer.MIN_VALUE;
			
		}
		
		double foodExpenses= (0.2)*salary;
		System.out.println("salary after foodexpenses:"+ foodExpenses);
		double travelExpenses=(0.3)*salary;
		System.out.println("salary after travelExpenses:"+ travelExpenses);
		
		double shiftEarngings= ((0.02)*salary)* shift;
		System.out.println("total shift earnings:"+ shiftEarngings);
		
		//System.out.println(shiftEarngings);
		
		double totalSavings= (salary - foodExpenses - travelExpenses )+ shiftEarngings;
		
		return totalSavings;
	}

}
