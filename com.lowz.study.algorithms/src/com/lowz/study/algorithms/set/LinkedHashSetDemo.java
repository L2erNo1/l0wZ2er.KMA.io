package com.lowz.study.algorithms.set;

import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Person> set = new LinkedHashSet<Person>();
		
		set.add(new Person(3));
		set.add(new Person(2));
		set.add(new Person(1));
		set.add(new Person(1));
		
		for(Person p : set) {
			System.out.println(p.getId());
		}
		
		System.out.println("sau khi xoa");
		set.remove(new Person(1));
		
		for(Person p : set) {
			System.out.println(p.getId());
		}
		
	}
}
