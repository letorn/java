package se2.day01;

import java.io.File;

/*
 * 使用File获取目录下子项
 */
public class FileListDemo {
	public static void main(String[] args) {
		File file = new File(".");
		//file是否为一个目录
		if(file.isDirectory()){
			//获取当前目录下的所有子项
			File[] subFiles = file.listFiles();
			
			for(int i=0;i<subFiles.length;i++){
				File f = subFiles[i];
				System.out.println(f.getName() + ":" + f.length());
			}
			
//			for(File f:subFiles){
//				System.out.println(f.getName() + ":" + f.length());
//			}
		}
	
	}
}
