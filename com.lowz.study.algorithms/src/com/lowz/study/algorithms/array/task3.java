package com.lowz.study.algorithms.array;

import java.util.*;

public class task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[n - 1];
		int j = 0;
		int k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i == k)
				continue;
			b[j] = a[i];
			j++;
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
