package com.lowz.study.comparable;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, " D"));
		list.add(new Person(4, " A"));
		list.add(new Person(6, " Z"));
		list.add(new Person(2, " C"));
		list.add(new Person(7, " D"));
		
		System.out.print("\nDay truoc khi sap xep la:");
		for(Person p : list) {
			System.out.println(p.getId() + p.getName());
		}
		
		System.out.println("\nDay sau khi sap xep la:");
		Collections.sort(list);
		for(Person p : list) {
			System.out.println(p.getId() + p.getName());
		}

	}

}
