package basics.Arrays;

import java.util.Scanner;

/*
 * 2D Array
 */
public class Array2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[][]= new int[3][3];
		System.out.println("Enetr Array Details");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
