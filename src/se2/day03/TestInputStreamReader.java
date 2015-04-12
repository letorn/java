package se2.day03;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * 作用字符流读取文本文件
 * 1:创建读取文件的FileInputStream
 * 2:创建读取字符的InputStreamReader
 * 3:循环读取字符,并打印到控制台
 * 4:关闭流
 */
public class TestInputStreamReader {
	public static void main(String[] args) throws Exception{
		//1
		FileInputStream fis = new FileInputStream("linux.txt");
		//2
		/*
		 * 构造方法:
		 *   InputStreamReader(InputStream in):以系统默认字符集读取字节流中的字节,并解析字符
		 *   InputStreamReader(InputStream in,String charset):以给定的字符集编码读取字节流中的字节,并解析字节(推荐使用)
		 *   
		 */
		InputStreamReader reader = new InputStreamReader(fis,"gbk");
		int data = 0;
		/*
		 * 注意,字符流的read()方法返回的不是一个字节,而是一个字符
		 *   相同点在于,若读取到文件末尾,返回值为-1
		 */
		while((data=reader.read()) != -1){
			/*
			 * 将int值表示char强制转换为字符char,并输出
			 */
			System.out.print((char)data);
		}
		reader.close();
		fis.close();
	}
}
