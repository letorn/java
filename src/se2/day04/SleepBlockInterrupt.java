package se2.day04;
/*
 * Sleep Block打断
 */
public class SleepBlockInterrupt {
	public static void main(String[] args) {
		/*
		 * 使用匿名类的方式创建Thread
		 */
		Thread t = new Thread(){
			public void run(){
				long start = System.currentTimeMillis();
				try{
					Thread.sleep(10000);//阻塞10秒钟
				}catch(Exception e){
//					e.printStackTrace();
				}
				long end = System.currentTimeMillis();
				System.out.println("睡眠了" + (end - start) + "毫秒");
				System.out.println("线程死了.");
			}
		};
		
		t.start();//启动线程
		
		try{
			Thread.sleep(3000);//让main线程阻塞3秒
			t.interrupt();//打断t线程的sleep block
		}catch(Exception e){
//			e.printStackTrace();
		}
		System.out.println("main线程死了");
		
		
//		Runnable r = new Runnable(){
//			public void run(){}
//		};
//		Thread t2 = new Thread(r);
		
//		Thread t2 = new Thread(new Runnable(){
//			public void run(){}
//		});
		
	}
}
