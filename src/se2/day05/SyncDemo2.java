package se2.day05;

/*
 * 同步锁演示
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Foo foo = new Foo();

		// Runnable runnable = new Runnable(){
		// public void run(){
		//				
		// }
		// };

		// Thread t = new Thread(runnable);
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 200; i++) {
					foo.add();
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 200; i++) {
					foo.add(1);
				}
			}
		};
		t.start();
		t2.start();
	}
}

class Foo {
	int a = 0;

	public synchronized void add(int b) {
		System.out.println("call add(b)");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		a += b;
		System.out.println("over call add(b)");
	}

	public synchronized void add() {
		System.out.println("call add()");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		a++;
		System.out.println("over call add()");
	}
}
