package core;

public class RevDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int y = f(n);
		System.out.println(y);
	}
	// 递归函数f(n) = n + f(n-1) && f(1) = 1
	public static int f(int n){
		if(n == 1){
			return 1;
		}
		return n + f(n-1);
	}
}
