package com.lowz.study.algorithms.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "A");
		map.put(3, "A");
		map.put(2, "A");
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		//TreeMap sap xep theo chieu tang dan cua key
		map.remove(1);
		

	}

}
