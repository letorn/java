package se2.day01;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception{
		// "."当前目录,这个属于相对路径
		//"."所代表的目录为当前项目目录
		//当前file对象描述项目文件夹下的tt.txt文件
		File file = new File("." +File.separator + "tt.txt");
		//如果文件不存在
		if(!file.exists()){
			file.createNewFile();//创建这个文件
		}
		System.out.println(file.getName());//输出文件名
		System.out.println(file.length());//输出文件长度
		System.out.println(file.getAbsolutePath());//绝对路径 F:\Temp\workspace\letorn\.\tt.txt
		System.out.println(file.getCanonicalPath());//规范化的绝对路径 F:\Temp\workspace\letorn\tt.txt
		
		/*
		 * 创建目录
		 */
		File dir = new File("." + File.separator + "a" + File.separator + "b");
		if(!dir.exists()){
			dir.mkdirs();//创建这个目录
		}
	}
}
