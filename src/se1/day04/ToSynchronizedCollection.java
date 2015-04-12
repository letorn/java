package se1.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 同步化(线程安全)的集合
 * 同步化的解决方案
 *   Collections.synchronizedList()方法可以将一个集合转换为一个线程安全的集合
 *   例如
 *     ArrayList list = new ArrayList();
 *     //相当于创建了一个Vector
 *     List arr = Collections.synchronizedList(list);
 *     
 *     //
 *     HashSet set = new HashSet();
 *     set s = Collections.synchronizedSet(set);
 *     
 *     //HashTable
 *     HashMap map = new HashMap();
 *     Map m = Collections.synchronizedMap(map);
 *     
 * Collection和Collections
 *   Collections:是集合的工具类
 *   Collection:是集合的接口,它有两个接口,分别为List和Set
 */
public class ToSynchronizedCollection {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		//将ArrayList转换为一个线程安全的List
		List list = Collections.synchronizedList(array);
		System.out.println(list);
	}

}
