package com.lowz.study.algorithms.set;

import java.util.*;

public class DemoSet {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add("B");
		setString.add("A");
		setString.add("D");
		setString.add("C");
		setString.add("B");
		
		for(String s : setString) {
			System.out.println(s);
		}
		//HashSet khong dung vong for duoc
		//Co the dung Iterator
		// Set la day cac phan tu duy nhat.
	}

}
