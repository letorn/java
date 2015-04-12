package se2.day03;

import java.io.FileOutputStream;
import java.io.PrintWriter;
/*
 * 缓冲字符输出流
 * PrintWriter的构造访求:
 *   PrintWriter(Writer writer)
 */
import java.io.OutputStreamWriter;
		
public class TestPrintWriter {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("o.dat");
		OutputStreamWriter writer = new OutputStreamWriter(fos,"utf-8");
		PrintWriter pw = new PrintWriter(writer);
		
		//PrintWriter可以以行为单位写出字符串
		pw.println("大家好才是真的好.");
		pw.println("你们好!");
		
		pw.flush();//尽可能加上,否则会出问题
		
		pw.close();
		writer.close();
		fos.close();
		
	}
}
