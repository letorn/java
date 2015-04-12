package core;

public class FloatDemo {
	public static void main(String[] args) {
		int a1 = 0x7fffffff;
		int a2 = 0x7ffffff0;

		System.out.println(a1 == a2);
		System.out.println(a1 - a2);

		float f1 = a1;
		float f2 = a2;
		System.out.println(f1 == f2);
		System.out.println(f1 - f2);

		int max = 0x7fffffff;
		int x = max * 200;
		float f = max;
		f = f * 500;
		System.out.println(x);// 溢出一塌糊涂
		System.out.println(f);// 不够精确的1T
		// float 范围比 int 大很多
	}
}