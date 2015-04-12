package se1.day01;

/**
 * 理解字符串的特性
 * 理解不变对象在内存中的变化
 */

public class TestString2 {
	public static void main(String[] args){
		String s= "abc";//在堆中创建字符串对象"abc"
		String s1 = s;//s1引用"abc"对象
		s+="def";//堆中创建"def"运算后创建对象"abcdef"赋值给s
		System.out.println(s1);//abc
		System.out.println(s);//abcdef
	}
}
