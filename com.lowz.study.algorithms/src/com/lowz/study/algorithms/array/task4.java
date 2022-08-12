package com.lowz.study.algorithms.array;

import java.util.*;
import java.lang.Math;

public class task4 {
	public static boolean isPrime(int a) {
		if (a < 2) {
			return false;
		} else if (a == 2 || a == 3) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i]))
				System.out.print(a[i] + " ");
		}

	}
}
