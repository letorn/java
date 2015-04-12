package se2.day06;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*
 * 
 */
public class FlowLayoutDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("FlowLayout");
		frame.setLayout(new FlowLayout());
		Button btn1 = new Button("按钮1");
		Button btn2 = new Button("按钮2");
		Button btn3 = new Button("按钮3");
		Button btn4 = new Button("按钮4");
		Button btn5 = new Button("按钮5");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
