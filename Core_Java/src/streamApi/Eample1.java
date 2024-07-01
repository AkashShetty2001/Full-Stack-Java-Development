package streamApi;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Eample1 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a= new ArrayList<>();
		a.add(0);
		a.add(10);
		a.add(15);
		a.add(20);
		
		//print even objects in a(till jdk 1.7)
		ArrayList<Integer> ans= new ArrayList<>();
		for(Integer i1:a) {
			if(i1%2 == 0) {
				ans.add(i1);
			}
		}
		System.out.println(ans);
		
		//using same problem in stream
//		Stream s=a.stream();
//		System.out.println(s);
//		System.out.println(s.getClass().getName());
		
		
		//1.configuration
		//2.processing
		//3.collect the processed objects
		List<Integer> a1=a.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(a1);
		a1.forEach(System.out::println);
		
	}

}
