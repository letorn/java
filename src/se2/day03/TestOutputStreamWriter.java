package se2.day03;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
 * 字符输出流
 * 1:创建写文件的FileOutputStream
 * 2:创建字符输出流OutputStreamWriter
 * 3:以字符为单位写数据
 * 4:关闭流
 */
public class TestOutputStreamWriter {
	public static void main(String[] args) throws Exception{
		//1
		FileOutputStream fos = new FileOutputStream("out.txt");
		//2
		OutputStreamWriter writer = new OutputStreamWriter(fos,"utf-8");
		//3
		writer.write("大家好才是真的好.");
		writer.write('好');
		//4
		writer.close();
		fos.close();
	}
}
