package com.lowz.study.algorithms.stack;
import java.util.*;
public class task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack <Character> stacks = new Stack<>();
		for(int i = 0; i< str.length(); i++) {
			stacks.push(str.charAt(i));
		}
		while(!stacks.empty()) {
			System.out.print(stacks.pop());
		}
	}
}
