package se2.day03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * 缓冲字符输入流
 * 优点:
 *   可以以行为单位读取数据(读取一行字符,遇到回国为止)
 *   一行:连续读取字符,遇到"回车"结束
 * BufferedReader的构造方法:BufferedReader(Reader reader)
 * 1:创建用于读取文件的FileInputStream,字节为单位读取
 * 2:创建以字符为单位读取的InputStreamReader,字符为单位读取
 * 3:以行为单位读取字符的BufferedReader,行为单位读取
 * 4:行级读取文本文件
 * 5:关闭流  
 */
public class TestBufferedReader {
	public static void main(String[] args) throws Exception{
		//1
		FileInputStream fis = new FileInputStream("linux.txt");
		//2
		InputStreamReader reader = new InputStreamReader(fis,"gbk");
		//3
		BufferedReader br = new BufferedReader(reader);
		/*
		 * BufferedReader以行为单位读取数据的方法为:readLine()
		 * readLine()方法返回一个字符串,为读取的一行字符,若返回null,则代表EOF
		 */
		reader.skip(0);
		long start1 = System.currentTimeMillis();
		int data = 0;
		while((data=reader.read()) != -1){
			System.out.print((char)data);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("time1:" + (end1 - start1));
		fis.skip(0);
		br.skip(0);
		long start2 = System.currentTimeMillis();
		String str;
		while((str=br.readLine()) != null){
			System.out.print(str);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("time2:" + (end2 - start2));
		
		br.close();
		reader.close();
		fis.close();
	}
}
