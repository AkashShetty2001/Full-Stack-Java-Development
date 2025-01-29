package cretionationalDesignPattern.singletonDesignPattern;


//Without thread Safety
public class LazyWayEx1 {
	
	private static LazyWayEx1 lazy;
	//constructor
	private LazyWayEx1() {
		if(lazy!= null) {
			throw new RuntimeException("You are trying to break singleton ");
		}
		
	}
	
	public static LazyWayEx1 getLazywayEx1() {
		if(lazy==null) {
			lazy=new LazyWayEx1();
		}
			return lazy;
		
		
	}
	
	

}
