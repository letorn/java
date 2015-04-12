package se2.day01;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

/*
 * RandomAccessFile演示
 * 1 创建一个文件data.dat
 * 2 使用RandomAccessFile打开文件data.dat
 * 3 写入'A'和'B'
 * 4 写入一个int最大值0x7fffffff
 * 5 写入GBK编码的汉字'中'
 * 6 一次性读取数据
 * 7 关闭RandomAccessFile
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		//1
		File file = new File("." + File.separator + "data.dat");
		file.delete();
		if(!file.exists()){
			file.createNewFile();//创建文件
		}
		
		//2
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		System.out.println(raf.getFilePointer());//输出指针位置
		
		//3
		raf.write('A');//写入一个字符'A'
		System.out.println(raf.getFilePointer());//1
		
		raf.write('B');//写入一个字符'B'
		System.out.println(raf.getFilePointer());//2
		
		//4 写int最大值0x7fffffff
		int i = 0x7fffffff;
		raf.write(i>>>24);//00 00 00 7f
		raf.write(i>>>16);//00 00 7f ff
		raf.write(i>>>8);//00 7f ff ff
		raf.write(i);
		
		//5 写'中'
		String s = "中";
		byte[] gbk = s.getBytes("gbk");//返回'中'的GBK字节编码
		raf.write(gbk);//一次性写一个字节数组
		
		raf.seek(0);//将指针移动到文件头部
		//6 一次性读取所有字节
		/*
		 * RandomAccessFile读取数据的方法:
		 *   int read() 读取一个字节,返回为读取的数据,若为-1代表读取到文件末尾(EOF end of file)
		 *   int read(byte[] buf) 尝试一次性读取给定的数组长度的字节数,并存入该数组,
		 *                         但实际读取的字节数要以是否达到文件末尾为准
		 *                         返回值:总共读取的字节数,若为-1代表EOF(指针在文件末尾)
		 * raf.length()返回一个long值,代表当前文件的总字节数
		 */
		raf.seek(2);
		byte[] data = new byte[(int)raf.length()];
		int sum = raf.read(data);
		System.out.println("读取了" + sum + "个字节");
		
		//输出字节数组中的内容(以10进制形式)
		System.out.println(Arrays.toString(data));
		
		raf.seek(0);
		int a = raf.read();
		int b = raf.read();
		int c = raf.read();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		/*
		 * java1.5 后的新特性:增强for循环
		 * for(Type t:Array){
		 * 
		 * }
		 * Array:集合或者数组
		 * Type:集合或者数组中的元素类型
		 * t:引用变量
		 */
		
//		for(int j=0;j<data.length;j++){
//			byte b = data[j];
//			System.out.println(":::"+Integer.toHexString(b & 0xff));
//		}
//		
//		for(byte b:data){
//			System.out.println(Integer.toHexString(b));
//		}
//		System.out.println(Integer.toHexString(0xa & 0xd));
		
		//7
		raf.close();//
		System.out.println("文件操作完毕");
	}
}


