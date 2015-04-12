package se2.day04;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 
 */
public class MyFirstThread {
	public static void main(String[] args) throws Exception{
//		PrintStream ps = System.out;
		
		FileOutputStream fos = new FileOutputStream("thread.txt");
		PrintStream out = new PrintStream(fos);
		System.setOut(out);
		
		Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		
		/*
		 * 注意!调用start()方法来启动线程,不能直接调用run()方法,否则还是单线程运行
		 */
//		p1.run():
//		p2.run();
		
		p1.start();
		p2.start();
		
//		ps.flush();
//		out.flush();
//		fos.flush();
		
//		ps.close();
		out.close();
		fos.close();
		
//		System.setOut(ps);
	}
}

/**
 * 定义线程类,注意要继承Thread,否则不是线程
 * @author tarena0509
 *
 */
class Person1 extends Thread{
	/*
	 * Thread的子类应重写run()方法,来实现线程要做的事情,若我们定义的类不重写run()方法,此线程无意义,
	 * 因为Thread类的run()方法什么也没干
	 */
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("你是谁呀");
		}
	}
}

class Person2 extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("我是修水管的");
		}
	}
}