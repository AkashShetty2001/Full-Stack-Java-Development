package exception.UserdefinedException;
import java.util.Scanner;


public class Ex1 {
	public static void main(String [] args) {
		RTO r1 = new RTO();
		r1.initiate();
	}

}
class Applicant{
	int age;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
	}
	public void verify()throws UnderAgeException, OverAgeException {
		if(age<18) {
			UnderAgeException uae= new UnderAgeException("you are under age!");
			System.out.println(uae.getMessage());
			throw uae;
		}else if(age>60) {
			OverAgeException oae= new OverAgeException("you are over Aged!");
			System.out.println(oae.getMessage());
			throw oae;
		}else {
			System.out.println("you are eligible for License");
		}
	}
	
}

class RTO{
	public void initiate() {
		Applicant a= new Applicant();
		a.input();
		try {
		a.verify();
		}catch(OverAgeException e) {
			e.printStackTrace();
		}catch(UnderAgeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		
		}
	}
}

class UnderAgeException extends Exception{
	public UnderAgeException(String msg) {
		super(msg);
	}
}

class OverAgeException extends Exception{
	public OverAgeException(String msg) {
		super(msg);
	}
}
