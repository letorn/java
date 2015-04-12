package se2.day04;
/*
 * 后台线程
 */
public class TestDaemonThread {
	public static void main(String[] args) {
		Rose rose = new Rose();
		Jack jack = new Jack();
		
		jack.setDaemon(true);//jack设置为守护线程
		
		jack.start();
		rose.start();
		System.out.println(rose.getName());
		System.out.println(jack.getName());
	}
}

class Rose extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("i jump!!");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("AAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
	}
}

class Jack extends Thread{
	public void run(){
		while(true){
			System.out.println("you jump!i jump");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}