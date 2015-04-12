package core;

/*
 * 根据一个人的年龄和性别, 判断是否是小孩/男孩/女孩
 */
public class LogicDemo {
	public static void main(String[] args) {
		int age = 14;
		char sex = '男';
		boolean isMan = sex == '男';
		boolean isChild = age < 16;
		boolean isBoy = isChild && isMan;// true
		System.out.println(isBoy);

		boolean isGirl = isChild && !isMan;// false
		System.out.println(isGirl);

		boolean isKid = isBoy || isChild;// true
		System.out.println(isKid);
	}
}
