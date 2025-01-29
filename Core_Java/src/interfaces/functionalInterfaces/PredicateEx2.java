package interfaces.functionalInterfaces;
import java.util.function.Predicate;

//class MyPredicate1 implements Predicate<String> {
//	@Override
//	public boolean test(String name) {
//		if(name.length() >= 3) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//}
public class PredicateEx2 {
	public static void main(String args[]) {
		Predicate<String> p = name -> name.length() >= 3;
		System.out.println(p.test("Akash"));
		System.out.println(p.test("A"));
	}

}
