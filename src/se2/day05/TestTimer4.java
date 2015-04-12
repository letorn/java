package se2.day05;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer4 {
	public static void main(String[] args) {
		/*
		 * 倒计时计时器
		 */
		int min = 5;// 倒计时5分钟
		long start = System.currentTimeMillis();// 系统当前时间
		final long end = start + min * 60 * 1000;// 结束时刻的毫秒值

		final Timer timer = new Timer();

		/*
		 * 添加一个任务,用于在规定时间到达时结束Timer
		 */
		Date endTime = new Date(end);// 5分钟以后的时间

		timer.schedule(new TimerTask() {
			public void run() {
				timer.cancel();
			}
		}, endTime);
		/*
		 * 任务 延迟时间 任务间隔时间 schedule(TimerTask task,long time,long delay)
		 */
		timer.schedule(new TimerTask() {
			/*
			 * 每秒打印一次倒计时时间 1:用end(结束的那一刻的时间)减去当前系统时间,得到剩余的毫秒数 2:根据剩余的毫秒数计算时分秒
			 * 3:打印
			 * 判断式?表达式1:表达式2
			 */
			public void run() {
				long show = end - System.currentTimeMillis();
				long h = show / 1000 / 60 / 60;// 小时
				long m = show / 1000 / 60 % 60;// 分钟
				long s = show / 1000 % 60;// 秒
				System.out.println((h<10?"0"+h:h) + 
						           (s%2==0?":":" ") + 
						           (m<10?"0"+m:m) + 
						           (s%2==0?":":" ") + 
						           (s<10?"0"+s:s));
			}
		}, 0, 1000);
	}
}
