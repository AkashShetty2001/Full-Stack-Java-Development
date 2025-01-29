package streamApi;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream.*;
import java.util.stream.Collectors;

/*
 * convert names to uppercase
 */
public class Example3 {
	public static void main(String[] args) {
		
		
		List<String> names= new ArrayList<>();
		names.add("akash");
		names.add("vijeth");
		names.add("nagaraju");
		names.add("john");
		
		
		System.out.println(names);
		
		
		//till jdk1.7
		ArrayList<String> upCase=new ArrayList<>();
		for(String upperNames:names) {
			upCase.add(upperNames.toUpperCase());
		}
		
		System.out.println(upCase);
		
		//using streams
		List<String> ans=names.stream()
						      .map(name -> name.toUpperCase())
						      .collect(Collectors.toList());
		
		System.out.println(ans);
		ans.forEach(i -> System.out.print(i+" "));
		System.out.println();
		ans.forEach(System.out::println);
		
		System.out.println("===================");
		
		long l=names.stream().filter(name -> name.length()>5)
					  .count();
		System.out.println("no. of objects having length > 5 are:"+l);
		
		
	}

}
