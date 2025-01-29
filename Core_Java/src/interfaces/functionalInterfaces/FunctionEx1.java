package interfaces.functionalInterfaces;

import java.util.function.Function;

/*
 *  Function ->  To perform some operation and to return some result we should go
 for Function.
 
 T->  input type
 R-> return type
 
 public interface java.util.function.Function<T, R> {
 // 1 abstract method
  public abstract R apply(T);
  
  //default methods
  public <V> java.util.function.Function<V, R> 
compose(java.util.function.Function<? super V, ? extends T>);
  public <V> java.util.function.Function<T, V> 
andThen(java.util.function.Function<? super R, ? extends V>);

  //static method
  public static <T> java.util.function.Function<T, T> identity();
 }
 */
public class FunctionEx1 {
	public static void main(String[] args) {
		
		Function<String,Integer> p= name -> name.length();
		Integer output=p.apply("Akash");
		System.out.println(output);
	}

}
