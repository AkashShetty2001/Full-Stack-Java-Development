package interfaces.functionalInterfaces;
import java.util.function.Predicate;


/*
 *  Predicate -> To implement some conditional checks we should go for Predicate
 */

class MyPredicate implements Predicate<Integer>{
	public boolean test(Integer i) {
		if(i >= 10) {
			return true;
		}else {
			return false;
		}
		
	}
}
public class PredicateEx1 {
	public static void main(String[] args) {
		
		Predicate<Integer> p = new MyPredicate();
		System.out.println(p.test(10));
		
	}

}
