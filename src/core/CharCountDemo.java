package core;

import java.util.Arrays;

/*
 *  统计一个字符在字符串中的所有位置.
 */
public class CharCountDemo {
	public static void main(String[] args) {
		String str = "统计一个字符在字符串中的所有位置.";
		int[] ary = countAll(str, '字');
		System.out.println(Arrays.toString(ary));
	}

	/**
	 * 统计一个字符在字符串中的所有位置.
	 * @param str 被统计的字符串
	 * @param ch 统计的字符
	 * @return 数组, 包含所有的位置
	 */
	public static int[] countAll(String str, char ch) {
		// str = 统计字符在字符串中的所有位置.
		// ch = '字'
		int[] ary = {};
		// str.length() 可以检查字符串的长度
		for (int i = 0; i < str.length(); i++) {// i是每个字符的位置
			char c = str.charAt(i);// c就是字符串中每个字符
			if (c == ch) {// 找到被查找字符
				// i->ary;将数组扩展, 将i插入到数组中
				ary = Arrays.copyOf(ary, ary.length + 1);
				ary[ary.length - 1] = i;
			}
		}
		return ary;
	}
}
