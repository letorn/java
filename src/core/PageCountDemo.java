package core;

import java.util.Scanner;

public class PageCountDemo {
	public static void main(String[] args) {
		// int rows =28;//结果行数
		// int size = 10;//页面大小
		// //页数
		// int page = rows%size==0 ? rows/size : rows/size+1;
		// System.out.println(page);//3
		Scanner console = new Scanner(System.in);
		System.out.print("输入行数:");
		// console 控制台
		int rows = console.nextInt();// 从控制台读取数据
		int pages = pageCount(rows);
		System.out.println(pages);
	}

	public static int pageCount(int rows) {
		int size = 10;
		return rows % size == 0 ? rows / size : rows / size + 1;
	}
}
