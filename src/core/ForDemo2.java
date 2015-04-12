package core;

import java.util.Scanner;

public class ForDemo2 {
	public static void main(String[] args) {
		// String code = "6921317905038";
		// 0123456789012
		// char c = code.charAt(0);//'6'
		// int n = c - '0';
		Scanner console = new Scanner(System.in);
		System.out.print("输入条形码:");
		String code = console.nextLine();
		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < 12; i += 2) {
			// i=0,2,4,6,8,10,12
			char c = code.charAt(i);// '6','2','3'...
			int n = c - '0';
			c1 += n;
			// c1+=code.charAt(i) - '0';
			c2 += code.charAt(i + 1) - '0';
		}
		int cc = c1 + c2 * 3;
		int last = (10 - cc % 10) % 10;

		System.out.println(last);
	}

	public static boolean check(String ean13) {
		return false;
	}
}
