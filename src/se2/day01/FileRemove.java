package se2.day01;

import java.io.File;

/*
 * 文件及目录的删除
 */
public class FileRemove {
	public static void main(String[] args) {
		File file = new File("." + File.separator + "tt.txt");
		
		file.delete();//删除文件
		
		File dir = new File("."+File.separator+"a");
		dir.delete();//删除目录
		/*
		 * delete()方法若删除的是一个目录,那么该目录必须是空目录!
		 */
	}
}
