package se2.day04;
/*
 * 主动让出当前CPU时间
 */
public class TestThreadYield {
	public static void main(String[] args) {
		TestThread1 tt1 = new TestThread1();
		TestThread2 tt2 = new TestThread2();
		
		tt1.start();
		tt2.start();
	}
}

class TestThread1 extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("你是谁呀?");
			/*
			 * 当执行Thread.yield()方法后,此线程放弃当前CPU时间,主动进入runnbale状态
			 */
			Thread.yield();
		}
	}
}

class TestThread2 extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("我是修水管的");
			Thread.yield();
		}
	}
}