package core;

public class CharDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		//char ch = c + 1;//编译错误
		char ch = (char)(c + 1);//变量表达式,在运行期间执行
		c = 'A' + 1;//字面量表达式,Java编译器计算为结果字面量
		//c = 'A' + 65500;编译错误,'A' + 65500超过了char的范围了
		c = (char)('A' + 65500);
	}

}
