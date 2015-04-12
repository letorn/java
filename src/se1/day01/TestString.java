package se1.day01;

import java.util.Arrays;

/**
 * 字符串
 *
 */
public class TestString {
	public static void main(String[] args){
		//String
		char[] chs1 = new char[2];
		chs1[0] = '北';
		chs1[1] = '京';
		
		char[] chs2 = {'达','内','公','司'};
		
		System.out.println(chs2);
		/**
		 * 1 创建一个能包含6个元素的字符数组,并将chs1的元素放入
		 * 2 再将chs2的元素存入
		 */
		//                               源          长度
		//char[] chs3 = Arrays.copyOf(original, newLength);
		char[] chs3 = Arrays.copyOf(chs1,chs1.length + chs2.length);
		//                 源  源位置     目标   目标位置   长度
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(chs2, 0, chs3, chs1.length, chs2.length);
		
		System.out.println(chs3);//北京达内公司
		
		//字符串合并String = char[] + "数组的操作"
		String str1 = "北京";
		String str2 = "达内公司";
		String info = str1 + str2;
		System.out.println(info);
		
		//字符串的比较
		//若想比较两个字符串的值是否相等,不要使用"==",而应该使用
		//  equals()方法来进行比较
		String st1 = "北京";
		String st2 = "北京";
		System.out.println("st1 == st2?" + (st1 == st2));//false?
//		System.out.println(st1.hashCode());
//		System.out.println(st2.hashCode());
		
		String st3 = new String("北京");
		String st4 = new String("北京");
//		System.out.println(st3.hashCode());
//		System.out.println(st4.hashCode());
		System.out.println("st3 == st4?" + (st3 == st4));//false
		System.out.println("st3 equals st4?" + st3.equals(st4));//ture
	}
}
