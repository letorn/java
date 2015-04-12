package se1.day01;

/**
 * String API
 * 1 charAt() 给定位置,返回这个字符
 * 2 length() 返回当前字符串的长度
 * 3 trim() 去除字符串两边的[空白]
 * 4 toLowerCase() 将字符串小字化(只针对英文) 
 * 5 toUpperCase() 将字符串大写化
 * 6 indexOf() 判断给定的字符在字符串第一次出现的位置
 * 7 lastIndexOf() 判断给定的字符在字符串中最后一次出现的位置
 * 8 startWith() 是否以给定的字符串开始
 * 9 endsWith() 是否以给定的字符串结尾
 * 10 subString() 根据指定的内容拆分字符串
 * 11 toCharArray() 将字符串转换为char数组
 * 12 equalsIgnoreCase() 忽略大小写比较
 */

import java.util.Arrays;

public class StringAPI {
	public static void main(String[] args){
		String info = "北京达内科技有限公司.Tarena ";
		char cha = info.charAt(5);//技
		System.out.println(cha);
		
		System.out.println("info字符串的长度:" + info.length());
		
		//去除字符串两边的空白
		String newInfo = info.trim();
		System.out.println(newInfo);
		
		//将字符串转为大写
		String upper = info.toUpperCase();
		System.out.println(upper);
		
		//将字符串转为小写
		String lower = info.toUpperCase();
		System.out.println(lower);
		
		//"北京达内科技有限公司.Tarena "
		//查看字符出现的位置
		int index = info.indexOf("a");
		System.out.println("'a'的位置:" + index);
		
		int lastIndex = info.lastIndexOf("a");
		System.out.println("'a'的位置:" + lastIndex);
		
		//是否以给定字符串结尾
		boolean yn = info.endsWith(" ");
		System.out.println("是以给定的字符串结尾么?"+yn);
		
		//截取字符串
		// 0 1 2
		//"北京达内科技有限公司.Tarena "
		//                         [0,2)
		String sub = info.substring(0,2);
		System.out.println(sub);
		
		//拆分字符串
		//根据指定内容拆分(可以以正则表达式来拆分)
		//"北京达内科技有限公司.Tarena "
		String[] subs = info.split("\\.");//字符串中有:\n,\\,但是没有\.
		//subs = {"北京达内科技有限公司","Tarena "}
		System.out.println("拆分后的字符串数组长度:"+subs.length);
		System.out.println("字符串数组内容:"+ subs);
		System.out.println("字符串数组内容:"+ Arrays.toString(subs));
	}
}
