package core;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("贷款年限:");
		int years = console.nextInt();
		int months = years * 12;

		double base = 7.2;
		double rate;
		if (months < 3 * 12) {// 3年以内
			rate = base * 0.7;
		} else if (months < 5 * 12) {
			rate = base * 0.8;
		} else if (months < 10 * 12) {
			rate = base;
		} else {
			rate = base * 1.1;
		}
		System.out.println("贷款利率:" + rate);
	}
}
