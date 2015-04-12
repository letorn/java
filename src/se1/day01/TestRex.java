package se1.day01;

import java.util.Arrays;
//import java.util.regex.Pattern;

/* 测试String对正则表达式的支持
 * 
 */

/* 正则表达式:描述字符串的格式规则,以"^"开关,以"$"结尾
 * 1 [] 表示其中一个内容(区间从小到大)
 *     [1234] 表示1,2,3,4其中之一
 *     [abcdef] 表示a,b,c,d,e,f其中之一
 *     [a-z] 表示任意一个小字字母
 *     [0-9] 表示任意一个数字
 *     [0-9a-fA-F] 表示任意一个16进制数
 *     [^12] 表示除了1和2的其他内容
 * 2 \d 代表任意数字,相当于[0-9]
 * 3 . 代表任意字符
 * 4 \w 表示单词字符,相当于[0-9a-zA-Z_]
 * 5 \s 表示一个空白,\t,\n,\r,\b,\p
 * 6 \D 除了\d
 * 7 \W 除了\w
 * 8 \S 除了\s
 * 9 {m,n} 量词,m到n个,m和n必须是数字,m要小于n
 *     {m} m个
 *     {m,} m个以上
 *10 ?  量词,0到1个,相当于{0,1}
 *11 +  量词,1个以上,相当于{1,}
 *12 *  量词,0个以上,相当于{0,}
 *13 () 可以将多个表达式当作一项
 *14 |  项与项之间的或关系
 */

/* 邮政编码:6位数字 ^\d{6}$
 * ^[0-9][0-9][0-9][0-9][0-9][0-9]$
 *               ^[0-9]{6}$
 *               ^\d{6}$
 */

/* 用户名:8-10个单词字符 ^[0-9a-zA-Z]{8,10}$
 *                    ^\w{8,10}$
 */

/* 手机号码:^(\+86\s|0086\s)?\d{11}$
 *          +86 13810000000
 *         0086 13810000000
 *              13810000000
 *         ^(\+86|0086)?$ 要么出现+86,要么出现0086,要么不出现
 *         注:  ^\+86$,只能是 +86   ,    ^\s?$ 空白出现0-1次
 *         ^(\+86\s|0086\s)?$
 *         ^(\+86\s|0086\s)?\d{11}$
 *                      +86 13810000000
 *                      +86 99999999999
 */

/* 身份证:^\d{15}(\d{2}[0-9xX])?$
 *       [0-9xX] 要么是数字,要么是大小写的x
 *       (\d{2}[0-9xX]) 两位数字后要么是数字要么是大小写x
 *       ^\d{15}(\d{2}[0-9xX])?$
 *          110104190012123312
 *          11010419001212331x
 *          110104190012123
 */

/* email:   ^\w+@\w(\.[a-zA-Z]{2,3})+$
 *      xx12xx@163.com
 *      xx12xx@hotmail.com
 *      FANCQ@TARENA.COM.cn
 *      ^  \w+   @   \w   (\.[a-zA-Z]{2,3})+    $
 */

/* 字符串中支持的正则表达式
 *   s.matches() 匹配字符串s是否符合给定的正则表达式格式
 *   s.split() 拆分字符串,可以根据一个正则表达式拆分
 *   s.replaceAll() 将字符串s中符合正则表达式描述的内容替换为给定的字符串
 */

public class TestRex {
	public static void main(String[] args){
		String rex = "^\\d{15}(\\d{2}[0-9xX])?$";
		String info = "110104198810101234";
		boolean yn = info.matches(rex);
		System.out.println("满足要求么?" + yn);
		
		String strRex = "\\d+";
		String str = "hello123word456!!!";
		//目标hello_world_!!!
		//String restr = str.replaceAll(regex, replacement);
		String restr = str.replaceAll(strRex, "_");
		System.out.println(restr);
		
//		String s = "a123a123a123a7889a";//"aa123a123a123a7889" <==> "aa123a123a123a7889aaa",截前不截尾
//		String[] array = s.split("a");//"aa123a123a123a7889aaab",[,,123,123,123,7889,,,b]
//		System.out.println(Arrays.toString(array));
		
		String s = "a123a123a123a7889a";
		String[] array = s.split("\\d");
		System.out.println(Arrays.toString(array));
	}
}
