package com.lowz.study.algorithms.linkedlist.Jmaster;
import java.util.*;
public class VectorMain {

	public static void main(String[] args) {
		Person p1 = new Person(1);
		Person p2 = new Person(2);
		List<Person> list = new Vector<Person>();
		list.add(p1);
		list.add(p2);
		list.remove(1);
		for(Person i : list) {
			System.out.println(i.getId());
		}

	}

}
