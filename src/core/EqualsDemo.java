package core;

public class EqualsDemo {
	public static void main(String[] args) {
		int a;

		a = 1;
		a += 8;// a = a + 8
		System.out.println(a);// 9

		a = 88;
		a %= 10;// a = a % 10
		System.out.println(a);// 8

		/*
		 * >> 有符号位右移
		 * >>> 无符号位右移, 左边空出的位以0填充
		 */
		a = 17;// 00000000 00000000 00000000 00010000
		a >>>= 4;// a = a>>>4
		System.out.println(a);

		int n = 679172;
		int sum = 0;
		for (;;) {
			int last = n % 10;
			sum = sum * 10 + last;
			// n /= 10;
			// if (n == 0) {
			// break;
			// }
			if ((n /= 10) == 0) {
				break;
			}
		}
		System.out.println(sum);
	}
}
