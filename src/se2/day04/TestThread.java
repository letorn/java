package se2.day04;

/*
 * 测试线程优先级
 * 1:声明三个线程,每个线程体的内容大致一样
 *    循环若干遍,打印一句话,yield()让出cpu
 * 2:创建这三个线程的实例
 * 3:分别给三个线程的实例设置最高优先级,最低优先级,和默认优先级
 * 4:启动线程
 */
public class TestThread {
	public static void main(String[] args) {
		// 2
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		// 3
		t1.setPriority(Thread.MAX_PRIORITY);// t1最高优先级
		t2.setPriority(Thread.MIN_PRIORITY);// t2最低优先级
		// 4
		t1.start();
		t2.start();
		t3.start();
	}
}

// 1
class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("你是谁呀");
			Thread.yield();
		}
	}
}

// 2
class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("我是修水管的");
			Thread.yield();
		}
	}
}

// 3
class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("我是打酱油的");
			Thread.yield();
		}
	}
}