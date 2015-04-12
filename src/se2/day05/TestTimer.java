package se2.day05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 测试Timer类
 * Timer类的每个任务都是在一个独立线程执行的,Timer类的任务是TimerTask的子类,TimerTask的子类需要重写run()方法
 * 为Timer添加任务使用schedule()方法,每当添加任务后,任务会被立刻计时,当达到指定时间就会开始执行任务
 * schedule()有若干重载方法
 */
public class TestTimer {
	public static void main(String[] args) {
		/*
		 * 需求:周六提醒我去爬山
		 * 1:创建一个定时器Timer
		 * 2:定义并创建一个TimerTask,任务内容为打印字符串"去爬山了!"这里创建TimerTask子类的一个实例
		 *    一般采用匿名类方式
		 * 3:创建Date类用于表示任务执行的时间点(需要Calendar转化)
		 * 4:为Timer添加这个任务,并设置执行任务的时间
		 */
		//1:
		Timer timer = new Timer();//java.util.Timer
		//2
		TimerTask task = new TimerTask(){
			//重写run()方法,定义任务内容 
			public void run(){
				System.out.println("去爬山了!");
			}
		};
		//3  设置日期为周六
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		Date date = calendar.getTime(); 
		//4
		/*
		 * schedule(TimerTash task,Date time)
		 * 此重载方法的作用为:给Timer添加一个任务task,执行时间为time指定的时间点
		 *                 time指定的时间不能早于当前系统时间
		 * 效果:当系统时间达到了date所代表的时间时,就执行task的run()方法,来完成任务
		 */
		timer.schedule(task, date);
		System.out.println("main方法执行完了!");
	}
}
