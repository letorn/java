package se2.day06;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

/*
 * Panel
 * 不能独立存在
 * 可以容纳其他组件或容器,常见形式为(Panel套Panel...Panel存组件)
 */
public class TestPanel {
	public static void main(String[] args) {
		Label label = new Label("这是一个标签");
		Panel panel = new Panel();
		panel.setSize(200,200);//设置尺寸
		//向Panel中添加组件
		panel.add(label);
		Frame frame = new Frame("窗口");
		frame.setSize(200,200);
		//向窗口中添加Panel
		frame.add(panel);
		frame.setVisible(true);
	}
}
