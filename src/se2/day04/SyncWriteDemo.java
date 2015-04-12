package se2.day04;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 同步读写
 * 有先后次序
 * 读一次写一次
 */
public class SyncWriteDemo {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("syncDemo.dat");
//		OutputStreamWriter writer = new OutputStreamWriter(fos);
//		PrintWriter pw = new PrintWriter(writer);
//		InputStreamReader reader = new 
//		BufferedReader  br = new BufferedReader();
		PrintWriter pw = new PrintWriter(fos);
		String str = null;
		while(true){
			//读一句写一句
			str = scanner.nextLine();//读一句
			if(str.equalsIgnoreCase("q")){
				break;
			}
			pw.println(str);//写一句
		}
		pw.flush();
		pw.close();
		fos.close();//可不写
	}
}
