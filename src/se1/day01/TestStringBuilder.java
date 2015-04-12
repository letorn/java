package se1.day01;

/* 字符串缓冲 StringBuffer和StringBuilder
 *            方法几乎一样
 *            区别 StringBuilder不是线程安全的,是java1.5以后新增加的
 *                StringBuffer是线程安全的,是java1.0就存在的
 *            
 *   String = char[] + 操作,char[] 不可变
 *   StringBuilder = char[] + 操作,char[] 可变
 *   StringBuffer和StringBuilder的内部char[]是可变的,所以对其中的字符串修改就是修改内部的这个char[],
 *     若长度不够,会使用数组的变长算法自行维护char[]的长度,自动进行扩容工作
 *   
 *   append()方法,向当前字符串后追加新字符串
 *               功能等同于字符串的+=操作
 *   insert()方法,向当前字符串中插入新字符串
 *   delete()方法,从当前字符串中删除部分内容
 */

/*
 * 测试StringBuffer修改字符串内容的效率问题
 */
public class TestStringBuilder {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String info = "";
		for(int i=0;i<10000;i++){
			info +="A";
		}
		long end = System.currentTimeMillis();
		System.out.println("总共耗时:" + (end - start) + "毫秒");
		//System.out.println(info);
		
		start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<10000;i++){
			builder.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("总共耗时:" + (end - start) + "毫秒");
		
		//若想获取StringBuffer或StringBuilder所代表的字符串,需要调用它的toString()方法获取
		//System.out.println(builder.toString());
	}
}
