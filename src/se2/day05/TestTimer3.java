package se2.day05;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer3 {
	public static void main(String[] args) {
		final Timer timer = new Timer();
		// TimerTask task = new TimerTask(){
		// public void run(){
		// System.out.println("C4爆炸了!!!");
		// }
		// };
		// timer.schedule(task, 45000);

		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("C4爆炸了!!!");
			}
		}, 45000);
		
		timer.schedule(new TimerTask(){
			public void run(){
				System.out.println("解除炸弹");
				//取消timer的所有任务
				timer.cancel();
			}
		}, 5000);
	}
}
