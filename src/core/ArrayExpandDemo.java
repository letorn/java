package core;

import java.util.Arrays;

/*
 * 数组的动态扩展算法
 * 1 数组对象的长度是不可改变的!
 * 2 利用更换数组对象副本(长度增加/减少)的方式变通实现
 *   数组变量引用的数组对象长度发生变化
 */
public class ArrayExpandDemo {
	public static void main(String[] args) {
		int[] ary1 = new int[] { 4, 5, 6 };
		System.out.println(ary1.length);// 3
		ary1 = new int[] { 4, 5, 6, 7, 8 };
		System.out.println(ary1.length);// 5

		// 如下代码,宏观上实现了,在"数组"中追加元素8
		int[] ary = new int[] { 5, 6, 7 };
		System.out.println(Arrays.toString(ary));// [5,6,7]
		// ary.length=3;
		ary = Arrays.copyOf(ary, ary.length + 1);
		System.out.println(Arrays.toString(ary));// [5,6,7,0]
		// ary.length=4;
		ary[ary.length - 1] = 8;
		System.out.println(Arrays.toString(ary));// [5,6,7,8]
	}
}
