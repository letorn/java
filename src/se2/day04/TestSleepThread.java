package se2.day04;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Sleep阻塞
 */
public class TestSleepThread {
	/*
	 * 实际上,JVM在运行我们的应用程序时,是创建了一个线程来运行我们的main方法
	 */
	public static void main(String[] args) throws Exception{
//		long start = System.currentTimeMillis();
//		Thread.sleep(500);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		/*
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		while(true){
			System.out.println(sdf.format(new Date()));
			Thread.sleep(1000);//阻塞1秒钟
		}
	}
}
