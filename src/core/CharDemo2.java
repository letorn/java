package core;

public class CharDemo2 {
	public static void main(String[] args) {
		char c = '6';
		int n = c - '0';

		System.out.println(n);
		System.out.println(0);
		System.out.println('0');

		System.out.println("--------------------");

		// 转义字符: 不方便直接写出的字符,使用转义字符
		// 如: 换行字符
		c = '\n';// new line 换行
		c = '\r';// return 回车
		c = '\t';// tab
		c = '\b';// backspace
		c = '\0';// 编号为0的字符,在c语言踢字符串结束字符
		c = '\'';// 单引号
		c = '\"';// 双单引号
		c = '\u4e2d';// 编号为0x4e2d(20013)的字符
		// 区别: 0 '0' '\0' '\u0000' 48 '\u0030'
		System.out.println((int) 0);
		System.out.println((int) '0');
		System.out.println((int) '\0');
		System.out.println((int) '\u0000');
		System.out.println((int) 48);
		System.out.println((int) '\u0030');

		System.out.println('0' == '\u0030');
	}
}
