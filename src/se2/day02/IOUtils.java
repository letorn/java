package se2.day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * IO工具类
 */
public class IOUtils {
	public static void main(String[] args) throws Exception {
//		printHex("." + File.separator + "data.dat");
		copy_1("linux.txt","copy_1.txt");
		copy_2("linux.txt","copy_2.txt");
		copy_3("linux.txt","copy_3.txt");
	}
	/**
	 * 将给定名字的文件内容以16进制形式输出其数据
	 * @param fileName
	 */
	public static void printHex(String fileName) throws IOException{
		/*
		 * 1:通过给定的文件名创建一个文件输入输出
		 * 2:循环读取字节byte
		 * 3:将这个字节转换为16进制形式
		 * 4:关闭输入流
		 */
		//1
		FileInputStream fis = new FileInputStream(fileName);
		
		//避免代码重复,应优化第2步以后的所有为下面这句
		printHex(fis);
		
//		//2
//		int data = 0;
//		int sum = 0;//这个变量的作用是记录当前输出了多少字节,以便换行
//		while((data = fis.read()) != -1){
//			/*
//			 * 为避免字节的16进制值为f一下的显示格式问题
//			 * 再此做出小的修正:
//			 * 	7f ff ff ff d6 d0  3 77 f3
//			 *  7f ff ff ff d6 d0 03 77 f3
//			 */
//			if(data <= 0xf){
//				System.out.print("0");
//			}
//			//3
//			System.out.print(Integer.toHexString(data) + " ");
//			/*
//			 * 每输出10个字节就换行
//			 */
//			if(++sum % 10 ==0){//每输出了10个字节就换行
//				System.out.println();
//			}
//		}
//		//4
//		fis.close();
	}
	
	/**
	 * 给定一个输入流,将从输入流中读取字节并以16进制形式输出
	 * @param inputStream
	 */
	public static void printHex(InputStream inputStream) throws IOException{
		int data = 0;
		int sum = 0;
		while((data = inputStream.read()) != -1){
			if(data <=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(data) + " ");
			if(++sum % 10 ==0){
				System.out.println();
			}
		}
		inputStream.close();//这里要注意!输入流的关闭不要写在循环里边
	}
	
	/**
	 * 根据指定的文件名读取数据并以byte[]形式返回数据
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static byte[] read(String fileName) throws IOException{
		/*
		 * 1:根据fileName创建File对象file
		 * 2:根据file.length()获取文件长度(字节数)来创建byte[]数组
		 * 3:创建FileInputStream
		 * 4:循环读取数据并填充byte[](笨)
		 *     一次性读取一个字节数组的数据
		 * 5:关闭输入流
		 * 6:返回数组
		 */
		//1
		File file = new File(fileName);
		//2
		byte[] data = new byte[(int)fileName.length()];
		//3
		/*
		 * FileInputStream的构造方法
		 * FileInputStream(String fileName):根据给定的文件名打开这个文件的输入流
		 * FileInputStream(File file):根据给定的File对象打开这个文件的输入流
		 */
		FileInputStream fis = new FileInputStream(fileName);
		//4
		fis.read(data);//一次性读取文件全部内容
		//5
		fis.close();
		//6
		return data;
	}
	
	/**
	 * 拷贝
	 * 使用FileInputStream和FileOutputStream
	 * @param src
	 * @param dex
	 */
	public static void copy_1(String src,String des) throws Exception{
		//从源文件读取数据
		FileInputStream fis = new FileInputStream(src);
		//写入到目标文件
		FileOutputStream fos = new FileOutputStream(des);
		//用于保存每个字节
		int data = 0;
		long start = System.currentTimeMillis();//复制开始时间
		//循环读取源文件中的每个字节并写到目标文件中
		while((data = fis.read()) != -1){
			fos.write(data);
		}
		long end = System.currentTimeMillis();//复制完成时间
		System.out.println("用时" + (end - start) +"毫秒");
		fis.close();
		fos.close();
	}
	
	public static void copy_2(String src,String des) throws Exception{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		
		/*
		 * 将字节输入/输出流包装为缓冲输入/输入流,提高读写效率
		 */
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data = 0;
		long start = System.currentTimeMillis();
		while((data = bis.read()) != -1){
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时" + (end - start) +"毫秒");
		bis.close();
		fis.close();
		bos.close();
		fos.close();
	}
	
	public static void copy_3(String src,String des)throws Exception{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		
		byte[] buffer = new byte[1024*5];//5K
		int len = 0;
		long start = System.currentTimeMillis();
		while((len=fis.read(buffer)) != -1){
			fos.write(buffer,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时" + (end - start) +"毫秒");
		fis.close();
		fos.close();
	}
}
