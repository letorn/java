package core;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int score;

		while (true) {
			System.out.print("输入分数:");
			score = scanner.nextInt();

			if (score >= 0 && score <= 100) {
				break;
			}

			System.out.println("输入错误！");
		}

		String level;
		switch (score / 10) {
		case 9:
			level = "优秀";
			break;
		case 8:
			level = "良好";
			break;
		case 7:
			level = "中等";
			break;
		case 6:
			level = "及格";
			break;
		default:
			level = "不及格";
		}
		System.out.println(level);
	}
}
