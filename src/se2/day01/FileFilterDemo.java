package se2.day01;

import java.io.File;
import java.io.FileFilter;

/*
 * 文件过滤器
 * 作用:
 *   使用File的listFiles()方法时,对返回的内容进行过小,只返回我们感兴趣的文件或目录
 */
public class FileFilterDemo {
	public static void main(String[] args) {
		File file = new File("." + File.separator + "src" + File.separator+"se1" + File.separator + "day06");
		
		File[] allSub = file.listFiles();
		System.out.println("文件中总共有" + allSub.length + "个文件");
		
		File[] sub = file.listFiles(new ByName());
		System.out.println("文件中总共有" + sub.length + "个.java文件");
		
//		FileFilter ff = new FileFilter(){
//			public boolean accept(File sub){
//				return sub.getName().endsWith(".txt");
//			}
//		};
//		File[] sub2 = file.listFiles(ff);
//		System.out.println("文件中总共有" + sub2.length + "个.txt文件");
		
		File[] sub2 = file.listFiles(
				new FileFilter(){
					public boolean accept(File sub){
						return sub.getName().endsWith(".txt");
					}
				}
		);
		System.out.println("文件中总共有" + sub2.length + "个.txt文件");
	}
}

/*
 * 文件过渡方法
 */
class ByName implements FileFilter{
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.getName().endsWith(".java");
	}
	/*
	 * 过渡方法
	 *   File会将其目录下的所有子项逐个调用accept方法将他们传入,
	 *   若此项是我们需要的,accept方法应返回true,否则返回false
	 *   返回false的子项不会出现在File的listFiles()方法的返回值中
	 */
	
}
