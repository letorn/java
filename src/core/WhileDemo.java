package core;

import java.util.Random;

public class WhileDemo {
	public static void main(String[] args) {
		Random random = new Random();
		int i = 0;
		while (i++ < 4) {
			char c = (char) ('A' + random.nextInt(26));
			System.out.print(c);
		}
	}
}
