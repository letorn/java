package se2.day06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/*
 * BorderLayout布局
 */
public class BorderLayoutDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("BorderLayout");
		//此句可省略,Frame默认就是BorderLayout
		frame.setLayout(new BorderLayout(10,20));//水平,垂直
		Button btn1 = new Button("东");
		Button btn2 = new Button("西");
		Button btn3 = new Button("南");
		Button btn4 = new Button("北");
		Button btn5 = new Button("中");
		
		/*
		 * 使用重载的add()方法添加组件
		 */
		frame.add(btn1,BorderLayout.EAST);
		frame.add(btn2,BorderLayout.WEST);
		frame.add(btn3,BorderLayout.SOUTH);
		frame.add(btn4,BorderLayout.NORTH);
		frame.add(btn5,BorderLayout.CENTER);
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
