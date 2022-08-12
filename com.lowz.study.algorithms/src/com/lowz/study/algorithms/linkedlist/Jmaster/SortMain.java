package com.lowz.study.algorithms.linkedlist.Jmaster;

import java.util.*;

public class SortMain {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		listString.add("a");
		listString.add("w");
		listString.add("b");
		listString.add("g");
		listString.add("e");

		for (String i : listString) {
			System.out.print(i + " ");
		}

		System.out.println("\nDay sau khi sap xep");
		Collections.sort(listString);
		for (String i : listString) {
			System.out.print(i + " ");
		}

		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(1);
		listInt.add(16);
		listInt.add(9);
		for (int x : listInt) {
			System.out.println(x + " ");

			System.out.println("\nDay sau khi sap xep");
			Collections.sort(listInt);
			for (int z : listInt) {
				System.out.print(z + " ");
			}
		}
	}
}
