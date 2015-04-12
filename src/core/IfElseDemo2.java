package core;

import java.util.Scanner;

public class IfElseDemo2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("输入年龄:");

		int age = console.nextInt();
		if (age < 16) {
			System.out.println("小朋友好!");
		} else {
			System.out.println("大朋友好!");
		}
	}
}
