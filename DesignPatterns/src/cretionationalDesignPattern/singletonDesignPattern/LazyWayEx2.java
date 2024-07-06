package cretionationalDesignPattern.singletonDesignPattern;

//Thread safety
public class LazyWayEx2 {
	
	private static LazyWayEx2 lazy2;
	//constructor
	private LazyWayEx2() {
		
	}
	
	public static LazyWayEx2 getLazywayEx2() {
		if(lazy2==null) {
			synchronized(LazyWayEx2.class) {
				if(lazy2==null) {
			lazy2=new LazyWayEx2();
				}
			}
		}
			return lazy2;
	}
}

