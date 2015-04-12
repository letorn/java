package se1.day05;

import java.text.DecimalFormat;

/*
 * 数字输入输出
 */
public class DecimalFormatDemo {
	public static void main(String[] args) throws Exception{
		String numStr = "5.6%";
		//将5.6%转化为数字
		DecimalFormat df = new DecimalFormat("0.##%");//5.59%
		double d = df.parse(numStr).doubleValue();
		System.out.println(d);//0.056?
		
		double x = 0.07555555;
		String str = df.format(x);
		System.out.println(str);
	}
}
