package core;

import java.util.Scanner;

/*
 * 第二杯半价, 假设单价是5元
 *  1杯 5 元
 *  2杯 5 + 2.5
 *  3杯 5 + 2.5 + 5
 *  4杯 (5 + 2.5) * 2
 *  5杯 (5 + 2.5) * 2 + 5
 *  6杯 (5 + 2.5) * 3
 *  7杯 (5 + 2.5) * 3 + 5
 *  n杯 (5 + 2.5) * (n/2) + (n%2==0 ? 0 : 5)
 */
public class IfElseDemo3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("购买数量:");
		int cups = console.nextInt();
		int price = 5;
		double pay;
		if (cups % 2 == 0) {
			pay = (price + price / 2D) * (cups / 2);
		} else {
			pay = (price + price / 2D) * (cups / 2) + price;
		}
		System.out.println("支付金额:" + pay);
	}
}
