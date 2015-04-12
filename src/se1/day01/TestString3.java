package se1.day01;
/*
 * 字面量在字符串中的意义,以及java编译器的优化
 */
public class TestString3 {
	public static void main(String[] args){
		String s = "123abc";
		String s1 = s + "";//运行期间,创建新的字符串对象
		String s2 = "123" + "abc";//编译期间,"123" + "abc"  -->  "123abc"
		String s3 = "123abc" + "";
		String s4 = "1" + 2 + 3 + "abc";//字符串与非字符串进行'+'操作(合并字符串操作),会把非字符串转化为字符串后再合并
		//     s4 = "1" + "2" + 3 + "abc";
		//     s4 = "12" + "3" + "abc";
		//     s4 = "123" + "abc";
		String s5 = '1' + '2' + '3' + "abc";//字符的相加运算是以ASCII进行的
		String s6 = 1 + 2 + "3abc";//先进行1+2=3,再转化为"3",最后才与"abc"合并,得"33abc"
		
		System.out.println(s == s1);//false
		System.out.println(s == s2);//true
		System.out.println(s == s3);//true
		System.out.println(s == s4);//true?
		System.out.println(s == s5);//false
		System.out.println(s == s6);//false
	}
}
