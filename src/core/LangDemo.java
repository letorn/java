package core;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class LangDemo {

	public static void main(String[] args) {
		String str = StringUtils.repeat("java", 10);
		System.out.println(str);
		str = StringUtils.abbreviate("how long no see you!", 8);
		System.out.println(str);
		String str1 = StringUtils.leftPad("hahaha", 10);
		String str2 = StringUtils.leftPad("haha", 10);
		System.out.println(str1);
		System.out.println(str2);

		int[] arry = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arry));
		int[] arry1 = ArrayUtils.add(arry, 6);
		System.out.println(Arrays.toString(arry1));
	}

}
