package se1.day05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 日期的转换
 */
public class DateDemo {
	public static void main(String[] args){
		//获取格林威治时间到当前系统时间的毫秒值
		long now = System.currentTimeMillis();
		
		//不考虑闰年等问题,计算当前系统时间所在年
		long year = 1970 + now/1000/60/60/24/365;
		System.out.println("当前的年:" + year);
		
		/*
		 * Date
		 * Date的构造器
		 *   Date(long time):创建指定时间的Date对象
		 *   Date():代表当前系统时间
		 */
		Date date = new Date();//默认代表当前系统时间
		//Date的getYear()方法有"千年虫"问题
		int y = date.getYear() + 1900;//获取当前时间所在年
		System.out.println("当前的年:" + y);
		
		int month = date.getMonth() + 1;//获取当前时间所在月,从0开始
		System.out.println("当前的月:" + month);
		
		/*
		 * Calendar
		 * GregorianCalendar 格里高历(公元立法)
		 * GregorianCalendar = long + 公元历法的算法
		 */
		Calendar calendar = new GregorianCalendar();
		//1970.01.01 00:00:00
		Date d = new Date(0);
		System.out.println(d.getYear() + 1900 +"年" + (d.getMonth() + 1) + "月");
		//日历类Calendar没有千年虫问题,不用加偏移量1900
		Calendar c = new GregorianCalendar(1970,Calendar.JANUARY,1);
		//日历类获取对应时间单位都使用get()方法,参数为不同的时间单位
		//参数是一个int型,对应Calendar的常量
		//若想获取年,传入Calendar.YEAR,月:Calendar.MONTH
		int cyear = c.get(Calendar.YEAR);//获取对应的年
		System.out.println(cyear);
		int cmonth = c.get(Calendar.MONTH);//获取对应的月,从0开始
		System.out.println(cmonth);
	}
}
