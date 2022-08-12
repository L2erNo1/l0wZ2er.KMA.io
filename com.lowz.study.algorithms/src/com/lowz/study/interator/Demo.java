package com.lowz.study.interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		Iterator<String> itr = list.iterator();
		//Xoa phan tu cos gia tri A trong mang.
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.equals("A")) {
				itr.remove();
			}
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
