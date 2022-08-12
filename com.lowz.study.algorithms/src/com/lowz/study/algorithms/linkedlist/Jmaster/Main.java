package com.lowz.study.algorithms.linkedlist.Jmaster;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(1);
		Person p2 = new Person(2);
		Person p3 = new Person(3);

		// khai bao list
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);

		Person p = listPerson.get(0);
		System.out.println(p.getId());
		for (Person i : listPerson) {
			System.out.print(i.getId() + " ");
		}
		// Hoac la
		for (int i = 0; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i).getId());
		}
		// Xoa phan tu remove(x) x co the la index hoac la doi tuong
		listPerson.remove(2);
		//listPerson.remove(p1);
		for (int i = 0; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i).getId());
		}
		System.out.println("----------");
		
		for (int i = 0; i < listPerson.size(); i++) {
			System.out.println(listPerson.get(i).getId());
		}
	}
}
