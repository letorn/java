package se1.day04;
/*
 * 静态内部类
 */
public class StaticInnerClass {
	private int age ;
	private static String name;
	private void sayHello(){}
	private static void sayGoodBye(){
//		Inner o = new Inner();
	}
	
	public static void main(String[] args){
		/*
		 * 如何实例化一个类的静态内部类
		 * 格式:外部类.内部类 obj  = new 外部类.内部类();
		 */
		StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
		obj.sex = 10;
	}
	
	/*
	 * 静态内部类
	 * Inner这个类很类似StaticInnerClass的其他静态成员
	 * 在StaticInnerClass加载后就存在了
	 * 可以在Inner类中访问StaticInnerClass的其他静态成员(属性或方法)
	 */
	static class Inner{
		private int sex;//外部类无权访问(StaticInnerClass以外的类)
		public void say(){
//			age = 1;//不行,静态内部类中不能访问外部类的非静态成员
			name = "Xiloer";//可以,静态内部类中可以访问外部类的静态成员
//			sayHello();
			sayGoodBye();
		}
	}
}


