package se2.day05.net;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 将服务器的信息发送给客户端
 */
public class SendInfoToClientThread extends Thread{
	//对应客户端的输出流
	private OutputStream out;
	/*
	 * 
	 */
	public SendInfoToClientThread(OutputStream out){
		this.out = out;
	}
	public void run(){
		/*
		 * 1:将输出流转为字符缓冲输出流
		 * 2:创建Scanner用于描述键盘输入内容
		 * 3:循环将键盘输入的内容通过输出流发送给客户端
		 */
		//1
		PrintWriter pw = new PrintWriter(out);
		//2
		Scanner scanner = new Scanner(System.in);
		//3
		while(true){
			pw.println(scanner.nextLine());
			pw.flush();
		}
	}
}
