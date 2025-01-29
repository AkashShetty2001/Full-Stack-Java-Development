package interfaces.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateEx3 {
	public static void main(String args[] ) {
		 int[] arr = {0,5,10,15,20,25,30};
		 
		 Predicate<Integer> p1= i -> i>=10;
		 System.out.println("Elements greater than 10 are:");
		 m1(p1,arr);
		 
		 Predicate<Integer> p2= i -> i%2==0;
//		 System.out.println("Elements which are even no:");
//		 m1(p2,arr);
//		 
//		 System.out.println("Elements that are greater than 10 and even:");
//		 m1(p1.and(p2),arr);
		 
		 
	}
	public static void m1(Predicate<Integer> p,int x[]) {
		for(int i=0;i<x.length;i++) {
			if(p.test(x[i])) {
				System.out.println(x[i]);
			}
		}
	}

}
