package se1.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 集合工具类Collections
 */
public class TestCollections {
	public static void main(String[] args){
		List<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Jerry");
		names.add("Jack");
		names.add("Rose");
		names.add("Lee");
		names.add("Mac");
		System.out.println(names);//输出集合原始顺序
		
		//排序
		Collections.sort(names);
		System.out.println(names);
		
		//二分查找
		int index = Collections.binarySearch(names, "Lee");
		System.out.println(index);
		
		//乱序
		Collections.shuffle(names);
		System.out.println(names);
		
		/* Collections的排序方法sort对于我们刚才写的例子来讲,是调用了
		 *  集合中每个元素(String)的compareTo()方法进行的比较来完成的
		 */
	}
}
