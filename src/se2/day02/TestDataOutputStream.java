package se2.day02;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/*
 * 数据输出流
 * DataOutputStream是一个高级流
 * 可以很方便的将java中的数据以int double写出
 * 写一个int 5,写一个int -5,写double 5.0
 */
public class TestDataOutputStream {
	public static void main(String[] args) throws Exception{
		/*
		 * 1:创建低级流FileOutputStream
		 * 2:创建高级流DataOutputStream,使它基于FileOutputStream工作
		 * 3:使用高级流进行java数据类型的写出操作
		 * 4:关闭流
		 */
		//1
		FileOutputStream fos = new FileOutputStream("." + File.separator + "data2.dat");
		//2
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(5);//写一个int值
		dos.writeInt(-5);
		dos.writeLong(51);
		dos.writeDouble(5.0);
		dos.writeUTF("中国");//以UTF-8编码写"中国",3个字节描述
		dos.writeChars("中国");//以UTF-16BE编码,2个字节描述
		//4
		/*
		 * 关源原则:
		 * 1:关闭底层的低级流就可以
		 * 2:若需要逐个都关闭,应本着自高到低的顺序关
		 */
		dos.close();
		fos.close();
		
		IOUtils.printHex("." + File.separator + "data2.dat");
	}
}
