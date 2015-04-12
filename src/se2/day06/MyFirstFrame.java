package se2.day06;

import java.awt.Frame;

/*
 * 第一个窗口
 */
public class MyFirstFrame {
	public static void main(String[] args) {
		/**
		 * 1:创建Frame的实例
		 * 2:设置Frame的窗口尺寸
		 * 3:使其显示
		 */
		//1 可以使用重载的构造方法为窗口设置标题
		Frame frame = new Frame("我的第一个窗口");
		//2
		frame.setSize(200,200);
		//3
		frame.setVisible(true);
	}
}
