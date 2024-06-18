package basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;


/*
 * 1D array
 */
public class Array1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5]; // initializing an array
		/* arrays are treated as objects in java.
		 * memory will be given in heap.
		 */
		
//		System.out.println("Eneter  Array value");
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		int b[]= new int[] {1,2,3,4,5};
		for(int elem:b) {
			System.out.print(elem+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(b));
		
	}

}
