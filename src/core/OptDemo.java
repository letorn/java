package core;

public class OptDemo {
	public static void main(String[] args) {
		int i = 2;
		long l = 1L + i;
		int max = 0x7fffffff;
		System.out.println(max);
		l = max + 1;
		System.out.println(l);
		l = max + 1L;
		System.out.println(l);

		// 除法: 整数除法结果是整数,是整除现象
		int a = 5 / 2;// 2余1
		System.out.println(a);
		double d = 5 / 2;
		System.out.println(d);// 2.0
		d = 5D / 2;
		System.out.println(d);// 2.5

		System.out.println("---------------");

		int price = 5;
		System.out.println(price * (50 / 100));
		System.out.println(price * (50D / 100));
		System.out.println(price * (50.0 / 100));
		System.out.println(price * (50 / 100.0));

		System.out.println("---------------");

		// %取余数/求余 取余 取模
		// 5/3 得1 余2
		// n%3 如果n>=0 返回[0.3)
		int n = 5 % 3;// 2
		System.out.println(-1 % 3);// -1
		System.out.println(0 % 3);// 0
		System.out.println(1 % 3);// 1
		System.out.println(2 % 3);// 2
		System.out.println(3 % 3);// 0
		System.out.println(4 % 3);// 1
		System.out.println(5 % 3);// 2
		System.out.println(6 % 3);// 0
		System.out.println(7 % 3);// 1

		System.out.println("------------------");
		// 移位运算 与 *
		// 移位运算就是移动小数点,每移动一次乘以或除以对应的基数2
		System.out.println(1 << 2);// 4
		System.out.println(6 << 2);// 24
		System.out.println(18 >> 1);// 9
		System.out.println(9 >> 1);// 4
		// 11111111 11111111 11111111 11111111
		// 1 11111111 1111111 11111111 11111111
		System.out.println(-1 >> 1);// -1 负数高位补1,整数补0
		System.out.println(-1 >>> 1);// max 高位补0
	}
}
