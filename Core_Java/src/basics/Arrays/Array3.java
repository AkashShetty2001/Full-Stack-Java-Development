package basics.Arrays;

import java.util.Scanner;

/*
 * 3D Array
 */
public class Array3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[][][]= new int[3][3][3];
		System.out.println("Enetr Array Details");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
				a[i][j][k]=sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
				System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
			}
		}
	}

}
