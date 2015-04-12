package se2.day03;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 测试System.out对象
 */
public class TestSysout {
	public static void main(String[] args) throws Exception{
		System.out.println("我是输出的第一句话!");
		//先将输出到控制台的这个黑夜的System.out对象保存起来
		PrintStream ps = System.out;
		
		/*
		 * 创建另一个PrintStream,从这个输出流写出的内容是写到文件中去的
		 */
		FileOutputStream fos = new FileOutputStream("sysout.txt");
		PrintStream ops = new PrintStream(fos);
		
		/*
		 * 1:使System.out变为输出到文件的ops
		 * 2:通过System.out.println()输出内容
		 * 3:将默认的System.out对象ps还原
		 */
		//1
		System.setOut(ops);
		//2
		System.out.println("我是输出的第二句话");
		//3
		System.setOut(ps);
		System.out.println("我是输出的第三句话");
		/*
		 * 关闭流
		 */
		ops.close(); 
		fos.close();
	}
}
