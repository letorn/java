package core;

public class IntegerDemo {
	public static void main(String[] args) {
		int n = 5;
		// 5: 字面量/直接量/直接写出的常数
		// n: 变量
		// java 所有整数字面量默认都 int 类型

		// long max = 0xfffffffffffffff;// 编译错误, 字面量越界
		long max = 0xfffffffffffffffL;

		byte b = 120;
		// b=128;// 编译错误, 128超过byte范围了
		// short s = 32768;// 编译错误
	}
}
