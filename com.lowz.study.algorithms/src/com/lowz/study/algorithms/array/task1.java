package com.lowz.study.algorithms.array;

import java.util.Scanner;

public class task1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			a[i] *= a[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
