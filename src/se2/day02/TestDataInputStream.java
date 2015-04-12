package se2.day02;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/*
 * DataInputStream
 */
public class TestDataInputStream {
	public static void main(String[] args) throws Exception{
		/*
		 * 1:创建一个FileInputStream
		 * 2:创建一个DataInputStream
		 * 3:使用dis读取java数据类型
		 * 4:关闭流
		 */
		//1
		FileInputStream fis = new FileInputStream("." + File.separator + "data2.dat");
		//2
		DataInputStream dis = new DataInputStream(fis);
		//3
		int a = dis.readInt();//5
		int b = dis.readInt();//-5
		long c = dis.readLong();//51
		double d = dis.readDouble();//5.0
		String utf8 = dis.readUTF();//以UTF－8读取字符串
		char c1 = dis.readChar();//中
		char c2 = dis.readChar();//国

		//4
		dis.close();
		fis.close();
		System.out.println(d);
		System.out.println(utf8);
		System.out.println(c1);
	}
}
