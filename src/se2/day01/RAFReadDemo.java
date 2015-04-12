package se2.day01;

import java.io.File;
import java.io.RandomAccessFile;

/*
 * 使用RandomAccessFile读取文件
 * 任务:打开data.dat文件,读取数据
 * 
 * 文件模型:
 * 	  data:41 42 7f ff ff ff d6 d0
 *   index: 0  1  2  3  4  5  6  7
 * pointer: ^
 */
public class RAFReadDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("." + File.separator + "data.dat");
		//以只读的形式读取文件
		RandomAccessFile raf = new RandomAccessFile(file,"r");
		//只读取int值
		//移动指针到int值的开始位置
		raf.seek(2);
		int data = raf.read();//读取一个字节 7f
		System.out.println(raf.getFilePointer());//3
		int num = data;//num为最终要还原的int值
		//将低8位移动到最高的8位
		num = num | (data<<24);
		
		//读取第二个字节
		data = raf.read();//ff
		num = num | (data<<16);
		
//		读取第三个字节
		data = raf.read();//ff
		num = num | (data<<8);
		
//		读取第四个字节
		data = raf.read();//ff
		num = num | data;
		System.out.println(Integer.toHexString(num));
		
		//再将指针移动会int值的第一个字节
		raf.seek(2);
		int n = raf.readInt();//读取一个int值
//		raf.writeInt(0x7fffffff);//写入一个in t值
		System.out.println(Integer.toHexString(n));
		
		raf.close();
	}
}
