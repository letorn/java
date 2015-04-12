package se1.day03;
/* 排序
 */
public class TestSort {
	public static void main(String[] args){
		//演示字符串的比较
		int a = "Tom".compareTo("Jerry");//比较
		System.out.println(a);//a应该>0
		a = "Ben".compareTo("Tom");//比较
		System.out.println(a);//a应该<0
		a = "Tom".compareTo("Tom");//比较
		System.out.println(a);//a应该==0
	}
}
