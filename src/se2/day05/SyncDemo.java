package se2.day05;

import se2.day05.Table.Person;

public class SyncDemo {
	public static void main(String[] args) {
		Table table = new Table();
		Person p1 = table.new Person();
		Person p2 = table.new Person();

		p1.start();
		p2.start();
	}
}

class Table {
	int bean = 200;// 定义20个豆子

	/**
	 * 从桌子上取一个豆子 ＠return
	 */
	public int getBean() {
		synchronized (this) {
			// 若桌子上没有豆子了就抛出一个异常
			if (bean == 0) {
				throw new RuntimeException("没有豆子了");
			}
			Thread.yield();// 提高出现线程并发安全问题几率,不加也会出
			return bean--;// 返回当前带豆子,并对bean递减
		}
	}

	/*
	 * 定义一个内部类,这个类是一个线程,用于从桌子上取豆子
	 */
	class Person extends Thread {
		public void run() {
			int bean = 0;
			while (true) {
				/*
				 * 调用桌子的getBean()方法取豆子 注意,这里的getBean()方法可能会报错,因为豆子为0的时候
				 * 此方法报错,因为抛出的是RuntimeException所以可以不写 try
				 * catch,但是一旦报错,不解决,那么JVM会杀死这个线程
				 */
				bean = getBean();
				// getName()方法是线程的方法,返回当前线程名字
				System.out.println(getName() + "," + bean);
				Thread.yield();// 扩大线程安全问题几率
			}
		}
	}
}