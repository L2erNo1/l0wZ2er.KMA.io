package com.lowz.study.algorithms.map;

import java.util.Map.Entry;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(2, "C"); // Trong map Key la duy nhat
		map.put(null, "D");

		System.out.println(map.get(null));

		Set<Integer> keySet = map.keySet();

		for (Integer i : keySet) {
			System.out.println(i + " " + map.get(i));
		}

		System.out.println("sau khi xoa");
		map.remove(1);// xoa phan tu co key bang 1
		//map.clear(); // xoa toan bo
		Set<Integer> keySet2 = map.keySet();

		for (Integer i : keySet2) {
			System.out.println(i + " " + map.get(i));
		}
		
		
		for(Entry<Integer, String> s : map.entrySet()) {
			s.getKey();
			s.getValue();
		}
		
		Map<String, Person> mapPerson = new HashMap<String, Person>();
		mapPerson.put("A", new Person(1));
		Person p = mapPerson.get("A");
	}
}
