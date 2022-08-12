package com.lowz.study.algorithms.string;

public class StringDemo {

	public static void main(String[] args) {

		String s = "hello";
		s = s + "Trung tam Java";

		// String Builder va String Buffer làm giảm tiêu tốn bộ nhớ Heap //String
		// Builder tối ưu nhất.
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("hello");
		stringBuilder.append(" Duc Ninh");
		String s2 = stringBuilder.toString();

		System.out.println(s2);
		
		StringBuffer stringBuffer = new StringBuffer("hello ");
		stringBuffer.append("Duc Ninh");
		
		System.out.println(stringBuffer.toString());

	}
}
