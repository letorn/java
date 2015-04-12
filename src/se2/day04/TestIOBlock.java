package se2.day04;

import java.util.Scanner;

/*
 * IO阻塞
 */
public class TestIOBlock {
	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run(){
				Scanner scanner = new Scanner(System.in);
				String str = null;
				while(true){
					/*
					 * nextLine()方法会等待键盘输入内容,并在输入回车后返回结果,
					 *  那么在这个过程中,t线程就处于IO阻塞状态
					 */
					str = scanner.nextLine();
					System.out.println(str);
					if(str.equalsIgnoreCase("q")){//忽略大小写比较是否为"q"
						break;
					}
				}
			}
		};
//		t.setDaemon(true);
		t.start();
	}
}
