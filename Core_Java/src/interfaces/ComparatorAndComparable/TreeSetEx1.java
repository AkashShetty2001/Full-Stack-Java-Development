package interfaces.ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;


class MyComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		 return i1.compareTo(i2);
		
	}
	
}
public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(1);
		ts.add(6);
		ts.add(9);
		
		System.out.println(ts);
		
	}

}
