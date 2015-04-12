package se1.day04;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 将集合转换为数组
 * List转数组:list.toArray()方法,可以将一个List转换为数组
 *   注意:默认转换为Object数组,若想转换为指定数组,需要给toArray()方法传入指定数组
 */
public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		//默认转换为Object数组
		Object array[] = list.toArray();
		System.out.println(Arrays.toString(array));
		//转换为指定类型的数组
		/*
		 * toArrays()要求我们传入一个我们想要转换的具体类型数组的实例
		 *  这个数组长度可以是0,也最好是0,这样可以节省不必要的开支,因为
		 *  这个参数在toArrays()中的作用仅仅是通知该方法返回的数组的类型
		 *  而不会用到我们给的参数作为数组返回值
		 */
		String[] strs = list.toArray(new String[0]);
		System.out.println(Arrays.toString(strs));
		//int[] i = list.toArray(new int[0]);//报错
	}

}
