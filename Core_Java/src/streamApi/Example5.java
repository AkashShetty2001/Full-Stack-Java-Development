package streamApi;

import java.util.ArrayList;

/*
 * using max(),main()
 */
public class Example5 {
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(6);
		a1.add(2);
		a1.add(8);
		a1.add(11);
		a1.add(4);
		a1.add(2);
		
		
		Integer min=a1.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(a1);
		System.out.println(min);
		
		Integer max=a1.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
	}

}
