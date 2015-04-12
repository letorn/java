package core;

import java.util.Random;

/*
 * java.lang包中的类,默认导入(import)
 * java.lang.Math
 */

public class MethodDemo {
	public static void main(String[] args) {
		double d = Math.sqrt(2);// 开平方
		System.out.println(d);
		Random random = new Random();
		int i = random.nextInt(10);// 随机数 i = [0,10)
		System.out.println(i);

		char c = (char) ('A' + random.nextInt(26));
		System.out.println(c);
	}
}
