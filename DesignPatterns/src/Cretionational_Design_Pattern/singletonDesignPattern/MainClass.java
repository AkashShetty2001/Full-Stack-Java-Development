package cretionationalDesignPattern.singletonDesignPattern;

import java.lang.reflect.Constructor;

public class MainClass {
	public static void main(String[] args)throws Exception {
		LazyWayEx1 l1=LazyWayEx1.getLazywayEx1();
		LazyWayEx1 l2=LazyWayEx1.getLazywayEx1();
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
//		
//		EgerWayEx1 e1=EgerWayEx1.getEgerWayEx1();
//		EgerWayEx1 e2=EgerWayEx1.getEgerWayEx1();
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		
//		LazyWayEx2 lt1=LazyWayEx2.getLazywayEx2();
//		LazyWayEx2 lt2=LazyWayEx2.getLazywayEx2();
//		System.out.println(lt1.hashCode());
//		System.out.println(lt2.hashCode());
		
		Constructor<LazyWayEx1> constructor=LazyWayEx1.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		LazyWayEx1 l3=constructor.newInstance();
		System.out.println(l3.hashCode());
	}

}
