package core;

public class BinDemo {
	public static void main(String[] args) {
		int n = 1024 * 1024 * 1024;
		int m = n + n;
		System.out.println(n);
		System.out.println(m);
		System.out.println(~-3 + 1);
		System.out.println(~3 + 1);

		System.out.println(~-1);
		System.out.println(~0);

		int i = -1;
		System.out.println(Integer.toBinaryString(i));

		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(~1));
		System.out.println(Integer.toBinaryString(-1));

		n = 255;
		System.out.println(n);// 198
		System.out.println(Integer.toString(n, 16));

		n = 0100;
		System.out.println(n);
		System.out.println(Integer.toString(n, 10));

		n = 0xfffffffd;
		System.out.println(n);

		n = 0x7fffffff;
		System.out.println(n);// max

		n = 0x80000000;
		System.out.println(n);// min
		System.out.println(n - 1);
	}
}
