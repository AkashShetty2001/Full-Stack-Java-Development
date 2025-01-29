package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

/*
 * toArray() method.
 * 
 * Stream.of() 
 * stream can be applicable for a group of values
 * 
 */
public class Example6 {
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(6);
		a1.add(2);
		a1.add(8);
		a1.add(11);
		a1.add(4);
		a1.add(2);
		
		Object[] obj=a1.stream().toArray();
		for(Object o1:obj) {
			System.out.print(o1+" ");
		}
		System.out.println();
		System.out.println(obj.getClass().getName());
		
		Integer[] obj1=a1.stream().toArray(Integer[]::new);
		for(Object o1:obj1) {
			System.out.print(o1+" ");
		}
		System.out.println();
		System.out.println(obj1.getClass().getName());
		
		
		Integer a[]= {1,2,3,4,5,6,7,8};
		Stream s1=Stream.of(a);
		s1.forEach(System.out :: println);
		
		int aa[]= {1,2,3,4,5,6,7,8};
		IntStream ss1=Arrays.stream(aa);
		ss1.forEach(System.out :: println);
		
	}

}
