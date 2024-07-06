package cretionationalDesignPattern.singletonDesignPattern;

public class EgerWayEx1 {
	
	public static EgerWayEx1 eger= new EgerWayEx1();
	private EgerWayEx1() {
		
	}
	
	public static EgerWayEx1 getEgerWayEx1() {
		return eger;
	}

}
