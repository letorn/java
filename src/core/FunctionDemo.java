package core;

public class FunctionDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = f(x);// 调用函数
		System.out.println(y);
	}

	// 修饰词 返回值 函数名 参数列表
	public static int f(int x) {
		// 如果函数定义了返回值类型, 就必须使用 return 语句返回值
		int y = 4 * x + 6;
		return y;
	}
}
