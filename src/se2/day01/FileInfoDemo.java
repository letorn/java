package se2.day01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 文件信息
 */
public class FileInfoDemo {
	public static void main(String[] args) {
		File file = new File("." + File.separator + ".classpath");
		long last = file.lastModified();//返回最后修改时间的long值
		Date lastModified = new Date(last);//转换为date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(lastModified));
		
		System.out.println(file.getPath());//获取相对路径
		
		System.out.println(file.getAbsolutePath());//获取绝对路径
		
		try {
			//获取操作系统的文件系统的理想的(格式标准的)绝对路径
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
