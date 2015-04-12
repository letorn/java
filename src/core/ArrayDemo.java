package core;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] ary;// 声明了数量变量 ary
		int ary1[];// 声明了数组变量 ary1 不建议使用
		// System.out.println(ary[0]);// 编译错误, ary没有初始化
		ary = null;// null 没有
		// System.out.println(ary[0]);// 运行异常, NullPointerException

		// String str = "asdfg";
		// String str2 = str.CASE_INSENSITIVE_ORDER;

		ary = new int[] { 3, 4, 5 };
		System.out.println(ary[0]);

		// 3种方式赋值
		ary = new int[] { 4, 5, 6 };

		ary = new int[4];
		// 必须指定数组长度
		// new int[4] <==> new int[]{0,0,0,0}
		// 数组元素是自动初始化的.是自动初始为'0'值
		// 0 , 0.0 , \u0000 , fakse , null
		System.out.println(ary[1]);// 0
		boolean[] used = new boolean[4];
		System.out.println(used[1]);// false

		// {6,7,8}数组的静态初始化, "只能用于声明数组时候"
		int[] ary2 = { 6, 7, 8 };
		// ary = {7,8,9};// 编译错误, 静态数组不能用于赋值!

		// 数组元素的访问
		ary = new int[] { 5, 6, 7 };
		// java中变量 ary 的类型 int[]
		// 而 ary[1] 类型是 int
		// int a = ary;// 编译错误, ary 和 a 的类型不兼容
		int a = ary[1];// 读取元素
		System.out.println(a);
		ary[1] = 8;// 写入数组元素
		System.out.println(ary[1]);// 8

		// 数组对象的长度, 数组对象的长度是不可改变的
		System.out.println(ary.length);

		// 迭代(遍历)数组对象: 就是一处理数组元素
		for (int i = 0; i < ary.length; i++) {// i = 0,1,2
			int n = ary[i];// n = 5,8,7
			System.out.println(n);
		}

		// 越界访问:
		// System.out.println(ary[3]);//运行异常, 越界, ArrayIndexOutOfBoundsException
		// System.out.println(ary[ary.length]);//ary.length = 3, 运行异常, 越界
		System.out.println(ary[ary.length - 1]);
	}
}
