package streamApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;


/*
 * Sorting a list
 */
public class Example4 {
	public static void main(String args[]) {
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(6);
		a1.add(2);
		a1.add(8);
		a1.add(11);
		a1.add(4);
		a1.add(2);
		
//		System.out.println(a1);
//		System.out.println("sorting list using Collections class:");
//		Collections.sort(a1);
//		System.out.println(a1);
		
		//internally it makes use of camparable interface and compareTo(Obj1 obj)
		System.out.println("using stream() calling sort");
		List<Integer> ans=a1.stream().sorted().collect(Collectors.toList());
		System.out.println(ans);
		
		List<Integer> ans1=a1.stream().sorted((i1,i2) -> -(i1.compareTo(i2))).collect(Collectors.toList());
		System.out.println(ans1);
		
		
	}

}
