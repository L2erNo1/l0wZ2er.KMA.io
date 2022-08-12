package com.lowz.study.algorithms.linkedlist.Jmaster;

import java.util.*;

public class LinkedListMain {
	public static void main(String[] args) {
		Person person = new Person(1);
		List<Person> list = new LinkedList<Person>();
		list.add(person);
		for (Person i : list) {
			System.out.println(i.getId());
		}
		list.remove(0);
	}
}
