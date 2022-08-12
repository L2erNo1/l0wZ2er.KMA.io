package com.lowz.study.comparable;

import java.util.ArrayList;
import java.util.List;

public class Java8Comparator {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, " D"));
		list.add(new Person(4, " A"));
		list.add(new Person(6, " Z"));
		list.add(new Person(2, " C"));
		list.add(new Person(9, " D"));
		list.add(new Person(7, " D"));
		
		System.out.print("\nDay truoc khi sap xep la:\n");
		for(Person p : list) {
			System.out.println(p.getId() + p.getName());
		}
		
		// neu muon theo chieu nguoc lai thi thay dooi vi tri p1 voi p2
		list.sort((p1, p2)->{
			if(p1.getName().compareTo(p2.getName())>0) {
				return 1;
			}else if(p1.getName().compareTo(p2.getName()) < 0) {
				return -1;
			}else {
				if(p1.getId()- p2.getId() > 0){
					return 1;
				}
				else if(p1.getId() - p2.getId() < 0) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.print("\n*************************\n");
		System.out.print("\nDay sau khi sap xep la:\n");
		for(Person p : list) {
			System.out.println(p.getId() + p.getName());
		}
	}
}
