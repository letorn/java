package se1.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Comparable与Comparator
 *  若一个类实现了Comparable,就需要实现其中的compareTo()方法,这个
 *   方法规定了当前类的每个实例之间的比较规则
 *   
 *  但是,某些时间,我们对已经实现了Comparable的类进行比较时,不希望
 *   使用这个类的comparaTo()进行比较时,那么我们应当建立临时的比较
 *   规则,这时我们需要创建一个比较器Comparator
 *   
 *   Collections的sort方法默认使用集合中元素的compareTO()方法比较
 *    后进行排序,若想改变规则,可以使用Collections的sort的重载方法,
 *    传入一个比较器,来使用临时比较规则进行排序
 */
public class Demo {
	public static void main(String[] args){
		List<String> names  = new ArrayList<String>();	
		names.add("Tom");
		names.add("Jerry");
		names.add("Jack");
		names.add("Ross");
		names.add("Lee");
		names.add("Mac");
		System.out.println(names);//原始的集合顺序
		Collections.sort(names);//使用字符串默认的比较规则
		System.out.println(names);
		
		//创建比较器
		ByLength byLength = new ByLength();
		//Collections.sort(list, c);
		Collections.sort(names,byLength);
		System.out.println(names);
	}
}
/* 定义临时的比较规则(创建一个比较器)
 * 定义比较器时,在Comparator接口处应定义泛型,告知比较器需要比较的元素的类型
*/
class ByLength implements Comparator<String>{
	/* 比较o1与o2
	 * 若返回值大于0,说明o1>o2
	 *        小于0,说明o1<o2
	 *        等于0,说明o1==o2
	 */
	public int compare(String o1,String o2){
		System.out.println(o1 + " 和" + o2);
		return o1.length() - o2.length();
	}
}