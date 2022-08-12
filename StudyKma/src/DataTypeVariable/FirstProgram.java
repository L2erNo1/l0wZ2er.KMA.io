package DataTypeVariable;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Hay nhap gia tri cho x:");
		x = sc.nextInt();
		System.out.print("Hay nhap gia tri cho y:");
		y = sc.nextInt();

		System.out.println("So lon nhat trong hai so la: " + max(x, y));
	}

	public static int max(int x, int y) {
		return x > y ? x : y;
	}

}
