package core;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
		int balance = 100;
		int bet;
		Scanner console = new Scanner(System.in);
		do {
			System.out.print("输入押注数量：");
			bet = console.nextInt();
		} while (bet <= 0 || bet > balance);// 否定条件!!!
		System.out.println("押注数量：" + bet);
	}

	// public static int reverse(int num) {
	// int sum = 0;
	// do {
	// int last = num % 10;
	// sum = sum * 10;
	// } while (true);
	// }
}
