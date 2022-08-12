package com.lowz.study.algorithms.array;

import java.util.*;

public class task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < n; i++) {
			temp = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
				a[j] = temp;
			}
		}
		int k = 1;
		int i = 0;
		while(i < n) {
			if(a[i]==a[i+1]) {
				k++;
				i++;
			}else {
				System.out.print(a[i]+" - "+ k +"; ");
				k =1;
				i++;
			}
		}
	}
}
