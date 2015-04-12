package core;

public class CastDemo {
	public static void main(String[] args) {
		// 自动类型转换
		int n = 'A';
		// char 00000000 01000001
		// int 00000000 00000000 00000000 01000001

		// 强制类型转换
		n = -2;// 0xfffffffe
		long l = n;// int -> long 0xfffffffffffffffe

		n = -129;
		byte b = (byte) n;// 去掉int的高24位实现
		System.out.println(b);// 127

		n = 0xfff0007f;
		System.out.println(n);
		b = (byte) n;
		System.out.println(b);

		double d = 35.67;
		l = (long) (d + 0.5);// 人为增加四舍五入
		System.out.println();
	}
}
