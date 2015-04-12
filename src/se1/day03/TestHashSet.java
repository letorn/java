package se1.day03;

import java.util.ArrayList;
import java.util.HashSet;

/* 测试HashSet
 * 
 */
public class TestHashSet {
	public static void main(String[] args){
		//List 有序且元素可重复
		ArrayList list  = new ArrayList();
		//set 无序且元素不可重复
		HashSet set = new HashSet();
		
		list.add("tom");
		list.add("jerry");
		list.add("jack");
		list.add("boss");
		list.add("mac");
		list.add("jack");//重复添加jack
		System.out.println("list有" + list.size() + "个元素");
		System.out.println(list);
		
		set.add("tom");
		set.add("jerry");
		set.add("jack");
		set.add("boss");
		set.add("mac");
		set.add("jack");//不会添加重复元素
		System.out.println("set有" + set.size() + "个元素");
		System.out.println(set);
	}
}
