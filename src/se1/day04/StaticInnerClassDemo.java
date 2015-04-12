package se1.day04;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 静态内部类的演示
 */
public class StaticInnerClassDemo {
	public static void main(String[] args){
		String[] names = {"mac","killer","xiloer","boss"};
		StaticInnerClassDemo.ByLength byLength = new StaticInnerClassDemo.ByLength();
		Arrays.sort(names,byLength);
		System.out.println(Arrays.toString(names));
	}
	/*
	 * 定义一个比较器
	 * 它的静态内部类
	 */
	static class ByLength implements Comparator<String>{
		public int compare(String o1,String o2){
			return o1.length() - o2.length();
		}
	}
}
