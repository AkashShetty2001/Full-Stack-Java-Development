package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		
		List al= new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		Iterator i1=al.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
	}

}
