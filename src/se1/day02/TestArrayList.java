package se1.day02;

import java.util.ArrayList;
import java.util.List;

/* ArrayList
 * 
 */
public class TestArrayList {
	public static void main(String[] args){
		//多态
		//父类引用接受子类对象
		List list = new ArrayList();
		
		//向集合中添加4个字符串String元素
		list.add("北");
		list.add("京");
		list.add("中");
		list.add("国");
		System.out.println(list);
		
		//"中"在集合中的下标值,下标值从0开始
		int index = list.indexOf("中");
		System.out.println(index);
		
		//获取集合中下标值为3的元素
		System.out.println(list.get(3));
	}
}
