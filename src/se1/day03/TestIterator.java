package se1.day03;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* 迭代器Iterator
 */
public class TestIterator {
	public static void main(String[] args){
		Collection<String> collection = new HashSet<String>();
		collection.add("张三");
		collection.add("李四");
		collection.add("王五");
		collection.add("赵六");
		collection.add("田七");
		collection.add("刀八");
		
		//it是集合collection的视图
		Iterator<String> it = collection.iterator();//获取当前集合的迭代器Iterator
		
		/* it包含一个游标,当调用集合的iterator()方法获取迭代器后,
		 *  当前迭代器it就有一个游标,游标指向集合第一个元素[之前].
		 * 
		 * it看到的集合是一种顺序结构
		 * it=[ "张三","王五","赵六","刀八","李四","田七"]
		 *     ^
		 * 游标初始位置
		 */
//		it.hasNext();
//		it.next();
//		it.remove();
		while(it.hasNext()){//询问游标是否还有元素
			String name = it.next();//游标移动到下一个元素并获取它
			System.out.println(name);
		}
	}
}
