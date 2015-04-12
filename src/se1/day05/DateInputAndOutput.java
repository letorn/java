package se1.day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期的输入与输出
 */
public class DateInputAndOutput {
	public static void main(String[] args){
		//将一个Date表示的时间以特定的格式输出
		String format = "yyyy-MM-dd hh:mm:ss";
		
		//创建当前系统时间
		Date date = new Date();
		
		/*
		 * 创建用于日期输入输出的工具类SimpleDateFormat
		 * 创建实例的同时指定日期的格式
		 */
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//将date以format所描述的日期格式转换为字符串
		String d = sdf.format(date);
		System.out.println(d);
		
		/*
		 * String format = "yyyy-MM-dd hh:mm:ss";
		 * SimpleDateFormat sdf = new SimpleDateFormat(format);
		 * Date date = new Date();
		 * String d = sdf.format(date);
		 * System.out.println(d);
		 */
		
		/*
		 * 日期的输入
		 */
		String info = "2012-07-19 09:09:09";//"yyyy-MM-dd"
		try{
			Date today = sdf.parse(info);
			System.out.println(today);
			//转换为Calendar
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(today);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		/*
		 * String format = "yyyy-MM-dd hh:mm:ss";
		 * SimpleDateFormat sdf = new SimpleDateFormat(format);
		 * String info = "2012-07-19 09:09:09";
		 * Date today = sdf.parse(info);
		 * System.out.println(today);
		 * 
		 * Calendar calendar = new GregorianCalendar();
		 * calendar.setTime(today);
		 */
	}
}
