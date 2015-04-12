package core;

import java.util.Arrays;// Arrays是数组工具类

/*
 * 数组变量的赋值
 * 数组对象的复制
 */
public class ArrayCopyDemo {
	public static void main(String[] args) {
		// 数组变量的赋值
		int[] ary1 = { 4, 5, 6 };
		int[] ary2 = ary1;// 数组变量的赋值

		ary2[1] = 8;
		System.out.println(ary1[1]);

		// 数组对象的复制
		int[] ary3 = new int[ary1.length];// {0,0,0}
		for (int i = 0; i < ary1.length; i++) {
			ary3[i] = ary1[i];
		}

		ary3[1] = 10;
		System.out.println(ary1[1]);// 8

		String str = Arrays.toString(ary3);// 连接元素为字符串
		// 如{4, 10, 6}连接为: "[4,10,6]"
		System.out.println(str);

		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary2));
		System.out.println(Arrays.toString(ary3));

		int a = -212;
		System.out.println("a=" + a);
		// java 提供了高性能的数组对象复制方法:
		// System.arraycopy()
		int[] ary4 = new int[ary1.length];// {0,0,0}
		System.arraycopy(ary1, 0, ary4, 0, ary1.length);
		ary4[1] = 10;
		System.out.println(Arrays.toString(ary1));// [4,8,6]
		System.out.println(Arrays.toString(ary4));// [4,10,6]

		// Java5 提供了便捷的复制方法:Arrays.copyOf()
		int[] ary5 = Arrays.copyOf(ary1, ary1.length);
		ary5[1] = 10;
		System.out.println(Arrays.toString(ary1));// [4,8,6]
		System.out.println(Arrays.toString(ary5));// [4,10,6]
	}
}
