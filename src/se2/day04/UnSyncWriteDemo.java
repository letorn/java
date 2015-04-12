package se2.day04;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 异步读写操作
 */
public class UnSyncWriteDemo {
	public static void main(String[] args) throws Exception{
		/*
		 * 使用LinkedList存储字符串,方便对元素的增删操作
		 */
		final LinkedList<String> buf = new LinkedList<String>();
		
		/*
		 * 读写并发操作步骤
		 * 1:创建文件输出流
		 * 2:包装为PrintWriter缓冲字符输出流
		 * 3:定义从键盘读取信息的线程
		 *   3.1:创建Scanner,用于捕获键盘输入的信息
		 *   3.2:死循环,获取键盘输入信息
		 *   3.3:将输入的信息放入LinkedList的头部(buf.addFirst())
		 *   3.4:判断,若输入q就退出循环(线程也就结束)
		 * 4:定义将LinkedList中的数据写入文件的线程
		 *   4.1:死循环,从LinkedList中取出末尾的元素(buf.removeLast())
		 *   4.2:将删除的这个元素获取到并通过PrintWriter写入文件
		 *   4.3:判断,若集合中没有元素了,就睡眠一会(Thread.sleep())
		 * 5:设置定线程为后台线程
		 * 6:启动读线程
		 * 7:启动写线程
		 */
		
		//1
		FileOutputStream fos = new FileOutputStream("unsyncDemo.txt");
		//2
		final PrintWriter pw = new PrintWriter(fos);
		//3
		Thread readThread = new Thread(){
			public void run(){
				//3.1
				Scanner scanner = new Scanner(System.in);
				//3.2
				String str = null;
				while(true){
					str = scanner.nextLine();
					//3.3
					buf.addFirst(str);
					//3.4
					if(str.equalsIgnoreCase("q")){
						break;
					}
				}
			}
		};
		//4
		Thread writeThread = new Thread(){
			public void run(){
				String str= null;
				
//				while(true){
//					//4.1
//					if(!buf.isEmpty()){
//						//4.2
//						str = buf.removeLast();
//						//4.3
//						pw.println(str);
//					}else{
//						try{
//							Thread.sleep(5000);
//						}catch(Exception e){}
//					}
//				}
				
				while(true){
					//4.1
					if(buf.isEmpty()){
						try{
							Thread.sleep(5000);
							continue;
						}catch(Exception e){
							
						}
					}
					str = buf.removeLast();
					//4.2
					pw.println(str);
				}
			}
		};
		//5
		writeThread.setDaemon(true);
		//6
		readThread.start();
		writeThread.start();
		//7
		pw.flush();
		pw.close();
		fos.close();
	}
}
