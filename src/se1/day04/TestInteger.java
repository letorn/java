package se1.day04;

import java.util.ArrayList;

/* 包装类
 * 可以把基本类型转换为一个对象类型(引用类型)
 * 基本类型:保存数据本身
 * 引用类型:保存对象的地址
 * int               Integer
 * long              Long
 * double            Double
 * float             Float
 * char              Character
 * boolean           Boolean
 * byte              Byte
 * short             Short
 * 
 * 想把int 数据存入ArrayList中怎么办?
 * int a = 10;
 * ArrayList a1 = new ArrayList();
 * a1.add(a);//这样写在java1.4的时候是语法错误的!!!
 * add方法的参数是Object类型的
 * 
 * 解决办法 应该把int这个基本类型转换为一个对象类型(顶级父类是Object)
 * 	       使用简单类型对应的包装类的构造方法创建一个对应的包装类对象
 *  int a = 10;
 *  Integer num = new Integer(a);//将基本类型转为对应的包装类
 *  ArrayList a1 = new ArrayList();
 *  al.add(num);
 *  
 *  将基本类型数据转变为包装类的过程称为 装箱
 *  将包装类的对象转变为基本类型称之为 拆箱
 *  
 *  注意:java在1.5以后支持了自动拆装箱.
 *  
 * Double将字符串转换为double值,Double.parseDouble(str)
 * Double将对象转为double值(拆箱):d.doubleValue();
 * 以此类推,其他包装类方法类似
 * 
 * 注意事项:包装类是final的
 *         包装类是不变对象,与字符串类似
 *         包装类覆盖了toString(),equals(),hashCode(),compareTo()
 */
public class TestInteger {
	public static void main(String[] args){
		int a = 10;
		//装箱
		//num是引用类型,它指向一个Integer的对象,这个对象表示整数10
		Integer num = new Integer(a);
		
		//拆箱
		int b = num.intValue();
		
		//java1.5自动拆装箱
		//自动装箱
		Integer autoBoxing = 10;
		//自动拆箱
		int unAutoBoxing = num;
		
		ArrayList a1 = new ArrayList();
		a1.add(1);//<==>al.add(new Integer(a));//自动装箱
		
		/* 包装类提供了很多工具方法,便于操作其代表的基本类型数据
		 * 这里需要注意,工具方法多为静态的
		 */
		//将整数以16进制的字符串返回
		System.out.println(Integer.toHexString(10));
		//将整数转换为字符串形式
		System.out.println(Integer.toString(10));
		//将整数以2进制的字符串返回
		System.out.println(Integer.toBinaryString(10));
		
		String n = "16";
		int nn = Integer.parseInt(n);//将字符串转为整数
		System.out.println(nn);
		
		
	}
}
