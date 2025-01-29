package interfaces.functionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;


class Myconsumer implements Consumer<String>{
	@Override 
	public void accept(String name) {
		System.out.println("accept method is getting called for each object:");
		System.out.println(name);
	}
	
}
public class ConsumerEx1 {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("sachin");
		a.add("ronaldo");
		a.add("messi");
		a.add("kholi");
		
		
		//tradtional way to implementing
		Consumer<String> c= new Myconsumer();
		a.forEach(c);
		
		
		System.out.println("=============================");
		
		
		
		//lambda expressions
		System.out.println("using lambda");
		a.forEach( name -> System.out.println(name));
		
		System.out.println("=============================");
		
		//replacing lambda with method reference
		System.out.println("using method reference");
		a.forEach(System.out::println);
	}

}
