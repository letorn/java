package se1.day05;
/*
 * 局部内部类
 * 此种类是定义在[方法]中的
 * 局部内部类可以访问其他局部变量,但是被访问的局部变量必须是[final]的
 */
public class LocalInnerClass {
	public static void main(String[] args){
		final int a = 0;
		//定义局部内部类
		class Inner{
			private int b;
			public void add(){
				b+=a;//若在局部内部类中访问其它局部变量,该变量必须是final的
			}
		}
		
		Inner inner = new Inner();
		inner.add();
//		inner.b = 1;//不建议直接访问局部内部类的私有变量
	}
}
