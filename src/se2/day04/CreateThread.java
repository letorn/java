package se2.day04;
/*
 * 使用Runnable的模式创建线程
 */
public class CreateThread {
	public static void main(String[] args) {
		/*
		 * 第一种方式创建线程
		 */
		SimpleThread st = new SimpleThread();
		st.start();
		
		/*
		 * 第二种方式创建线程
		 */
		ThreadBody tb = new ThreadBody();
		Thread t = new Thread(tb);
		t.start();
	}
}
/*
 * 第一种方式创建线程,需要继承自Thread,重写run()方法
 * 优点:简单
 * 缺点:线程与线程执行的任务绑定在一起,层次不清晰
 */
class SimpleThread extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("我是修水管的");
		}
	}
}

/*
 * 第二种方式
 */
class ThreadBody implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("我是修水管的");
		}
	}
}