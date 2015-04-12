package core;

public class LogicDemo2 {
	public static void main(String[] args) {
		// 60以上的老太太参加:是女的 并且 年龄60以上
		// 与: && 短路逻辑判断, & 非短路逻辑(不太合理)
		int age = 68;
		char sex = '男';

		// 短路逻辑与&&
		// 当 sex == '女' 的结果为 false, 就能够确定全部(&&表达式)结果
		// age++ >= 60 就不执行了, 如果 age++ >= 60 不执行, age 就是68
		if (sex == '女' && age++ >= 60) {
			System.out.println("欢迎光临");
		}
		System.out.println(age);

		// 非短路逻辑与&
		// age++>=60被执行了
		if (sex == '女' & age++ >= 60) {
			System.out.println("欢迎光临");
		}
		System.out.println(age);

		System.out.println("---------------------");

		// 业务情况: 女的 或者 60以上的 都可以
		// 短路或||: 如果 第一个条件满足 true 就不处理第二个条件了
		// 非短路或|:
		age = 20;
		sex = '女';
		if (sex == '女' || age++ >= 60) {

			System.out.println("欢迎光临");
		}
		System.out.println(age);

		if (sex == '女' | age++ >= 60) {
			System.out.println("欢迎光临");
		}
		System.out.println(age);
	}
}
