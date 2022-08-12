package javacollectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
	List<Integer> arrInts = new ArrayList<Integer>();
	arrInts.add(16);
	arrInts.add(2001);
	arrInts.add(0, 9);

	
	for(Integer i : arrInts) {
		System.out.println(i);
	}
	
	}
}
