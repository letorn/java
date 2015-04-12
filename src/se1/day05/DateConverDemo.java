package se1.day05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 三种用于描述时间的类型之间的转换
 *   long ==> Date
 *   Date ==> long
 *   
 *   Date ==> Calendar
 *   Calendar ==> Date
 */
public class DateConverDemo {
	public static void main(String[] args){
		//long ==> Date
		long now = System.currentTimeMillis();
		//1 Date对象不存在,使用构造器将long转换为Date
		Date d1 = new Date(now);
		//2 Date对象已存在,使用setTime()方法,使Date代表long的时间
		d1.setTime(now);
		//打印时间,不是1970.01.01 00:00:00
		//而是1970.01.01 08:00:00,因为我们的系统处于+8区

		//Date ==> long
		//使用Date对象的getTime()方法,返回Date代表的long时间
		long time = d1.getTime();
		
		//Date ==> Calendar
		//1 Calendar不存在
		//  此举除非万不得已,否则不建议使用
		Calendar calendar = new GregorianCalendar(d1.getYear()+1900,d1.getMonth()+1,d1.getDate());
		
		//2 Calendar对象存在
		//  使用Calendar对象的setTime()方法,使Calendar代表一个Date
		calendar = new GregorianCalendar();
		calendar.setTime(d1);//参数为Date类型!
		
		//Calendar ==> Date
		d1 = calendar.getTime();
		
		/*
		 * 使用Calendar计算时间
		 */
		//1969.12.31
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		
		//1970.01.31
		calendar.add(Calendar.MONTH, 1);
	}
}
