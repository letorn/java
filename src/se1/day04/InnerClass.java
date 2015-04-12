package se1.day04;

public class InnerClass {
	public static void main(String[] args) {
		/*
		 * 创建一个类的成员内部类
		 * 1:实例化外部类 OutClass out = new OutClass();
		 * 2:根据外部类的对象创建内部类的实例
		 * 
		 * 理解:
		 *   我们想使用一个成员属性
		 *     语法为:对象.属性 例如:out.sex = 1;
		 *     
		 *   我们想实例化一个成员内部类
		 *     语法为:对象.new 内部类() 例如:out.new Inner();
		 */
		//1
		OutClass out = new OutClass();
		//2
		OutClass.Inner inner = out.new Inner();
		
		out.sex = 1;
	}

}

class OutClass{
	public int sex;
	private int age;
	private static String name;
	
	public void sayHello(){
		age = 1;
		name = "boss";
	}
	
	class Inner{
		/*
		 * 成员内部类,可以引用外部类的属性和方法
		 */
		public void say(){
			age = 1;
			name = "Xiloer";
		}
	}
}
