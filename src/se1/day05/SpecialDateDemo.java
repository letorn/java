package se1.day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 计算商品促销日期
 */
public class SpecialDateDemo {
	public static void main(String[] args) throws Exception{
		/*
		 * 1 定义一个生产日期的字符串
		 * 2 创建一个SimpleDateFormat并指定日期格式
		 * 3 将生产日期 的字符串转换为Date类型实例
		 * 4 调用specialDay方法计算促销日
		 * 5 以指定的格式输出促销日的信息
		 */
		//1
		String day = "2012-07-19";
		//2
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//3
		Date date = sdf.parse(day);
		//4
		Date spec = specialDay(date,2);
		//5
		String spedStr = sdf.format(spec);
		System.out.print("促销日期:" + spedStr);
	}
	/**
	 * 计算促销日,在商品保质期结束日的前两周的周五
	 * @param day 生产日期
	 * @param exp 保质期(月为单位)
	 * @return 促销日期
	 */
	public static Date specialDay(Date day,int exp){
		/*
		 * 1 创建一个日历类,用于计算时间
		 * 2 让日历类代表生产日期
		 * 3 计算保质期结束日
		 * 4 再算前两周
		 * 5 设置日历为两周前的那个周五
		 * 6 在转换为Date
		 */
		//1
		Calendar calendar = new GregorianCalendar();
		//2
		calendar.setTime(day);
		//3
		calendar.add(Calendar.MONTH, exp);
		//4
		//5
		calendar.add(Calendar.WEEK_OF_YEAR,-2);
		//5不是做加减运算了!!注意,是设置日期
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		
		return calendar.getTime();
	}
}
