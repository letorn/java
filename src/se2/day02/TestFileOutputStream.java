package se2.day02;

import java.io.File;
import java.io.FileOutputStream;

/*
 * 文件输出流
 */
public class TestFileOutputStream {
	public static void main(String[] args) throws Exception{
		/*
		 * 构造方法
		 * FileOutputStream(String fileName):根据fileName找到文件则覆盖,若没有此文件[自动创建]!
		 * FileOutputSteam(File file)
		 */
		FileOutputStream fos = new FileOutputStream("." + File.separator + "data2.dat");
		fos.write('A');
		fos.write('B');
		int a = -3;//ff ff ff fd
		fos.write(a>>>24);//00 00 00 ff
		fos.write(a>>>16);//00 00 ff ff
		fos.write(a>>>8);//00 ff ff ff
		fos.write(a);//ff ff ff fd
		//写一个GBK编码的"中国"
		byte[] b = "中国".getBytes("gbk");//[d6,d0,b9,fa]
		//一次性写入一个字节数组 
		/*
		 * write(byte b),一次性写入b字节数组的所有内容
		 * write(byte b,int start,int len),写入b字节数组中下标为start开始len个字节
		 */
//		fos.write(b);
		fos.write(b,2,2);//写国
		fos.close();
		//根据刚才写的工具类,读取这个文件
		IOUtils.printHex("." + File.separator + "data2.dat");
	}
}
