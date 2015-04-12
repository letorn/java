package se1.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 将数组转换为集合
 * 数组转List:Arrays.asList()方法,可以将一个数组转换为List
 *   注意:转换后的集合为只读
 */
public class ArrayToList {
	public static void main(String[] args) {
		String[] array = {"A","B","C"};
		//转换
		List list = Arrays.asList(array);
		/*
		 * 不可对集合做增删操作
		 */
//		list.add("D");
//		list.remove(0);
		System.out.println(list);
		
		//将只读的这个List转换为一个ArrayList
		list = new ArrayList(list);
		//转换后的ArrayList是一个全功能的List
		list.add("D");
		System.out.println(list);
		
//		转换为set
		Set set = new HashSet(list);
		System.out.println(set);
	}

}
