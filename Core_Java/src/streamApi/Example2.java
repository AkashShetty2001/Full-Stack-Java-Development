package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * using map function
 * if we want  some objects to be created for a particular object then we will go
 * for map.
 */
public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(0);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		
		
		//traditional way till jdk 1.7
		List<Integer> ans=new ArrayList<>();
		for(Integer i1:a) {
			ans.add(i1*2);
		}
		System.out.println(ans);
		
		List<Integer> l1=a.stream()
						.map(i -> i*2)
						.collect(Collectors.toList());
		
		System.out.println(l1);
		l1.forEach(System.out::println);
		l1.forEach(i->System.out.print(i+" "));
	}

}
