package se2.day04;

public class SleepDemo {
	public static void main(String[] args) {
		final Thread lin = new Thread(){
			public void run(){
				System.out.println("睡觉去了...");
				try{
					Thread.sleep(1000 * 60 * 60 *10);//睡10小时
				}catch(InterruptedException e){
					System.out.println("干嘛呢!破相了!!");
				}
			}
		};
		lin.start();
		
		Thread huang = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("80!!");//
					try {
						Thread.sleep(1000);
					} catch (Exception e) {}
				}
				System.out.println("咣当!搞定!!");
				lin.interrupt();
			}
		};
		huang.start();
	}
}
