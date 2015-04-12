package se2.day03;

import java.util.Arrays;

/*
 * 字符编码集
 */
public class CharCodeDemo {
	public static void main(String[] args) throws Exception {
		String info = "AB中";
		// 将字符串以utf-16be编码转换为字节序列
		byte utf16be[] = info.getBytes("utf-16be");
		System.out.println(Arrays.toString(utf16be));

		// 以utf-8编码转换
		byte[] utf8 = info.getBytes("utf-8");
		System.out.println(Arrays.toString(utf8));

		// 以GBK编码转换
		byte[] gbk = info.getBytes("gbk");
		System.out.println(Arrays.toString(gbk));
		
		//以当前字符集转换为byte[]数组中的内容
		String str = new String(gbk);
		System.out.println(str);
		
		//以特定的字符集(编码集)转换byte[]数组中的内容
		String str1 = new String(utf8,"utf-8");
		System.out.println(str1);
		
		String str2 = new String(utf16be,"utf-16be");
		System.out.println(str2);
		
		String str3 = new String(gbk,"gbk");
		System.out.println(str3);
	}
}
