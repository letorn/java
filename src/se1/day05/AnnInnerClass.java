package se1.day05;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 匿名内部类
 */
public class AnnInnerClass {
	public static void main(String[] args){
		String[] names = {"mac","jerry","boxx"};
		
//		成员内部类
//		Arrays.sort(names,new AnnInnerClass().new ByLength());
//		System.out.println(Arrays.toString(names));
		
		/*
		 * 构造匿名内部类
		 *   1 定义一个类(类名是匿名的),并继承或实现父类
		 *       class XXXX implements Comparator<String>
		 *   2 实现类体
		 *       class XXXX implements Comparator<String>{
		 *         public int compare(String o1,String o2){
		 *           return o1.length() - o2.length(); 
		 *         }
		 *       }
		 *   3 Comparator<String> comparator = new XXXX();
		 */
		Comparator<String> comparator = new Comparator<String>(){
			public int compare(String o1,String o2){
				return o1.length() - o2.length();
			}
		};
		Arrays.sort(names,comparator);
		System.out.println(Arrays.toString(names));
	}
	
//	class ByLength implements Comparator<String>{
//		public int compare(String o1, String o2) {
//			// TODO Auto-generated method stub
//			return o1.length() - o2.length();
//		}
//	}
}
