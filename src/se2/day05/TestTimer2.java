package se2.day05;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer2 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			public void run(){
				System.out.println("去爬山了!");
			}
		};
		
		/*
		 * schedule(TimerTask task,long time)
		 * 作用:延迟time毫秒后执行task的run()方法
		 */
		timer.schedule(task, 5000);
		System.out.println("main方法执行完了!");
		
	}
}
