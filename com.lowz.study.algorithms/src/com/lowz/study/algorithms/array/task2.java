package com.lowz.study.algorithms.array;

import java.util.*;

public class task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int k = scan.nextInt();
		int x = scan.nextInt();

		int[] b = new int[n + 1];
		b[k] = x;
		int j = 0;
		for (int i = 0; i < n + 1; i++) {
			if (i == k)
				continue;
			b[i] = a[j];
			j++;
		}

		for (int i : b) {
			System.out.printf(i + " ");
		}
	}

}
