package se2.day06;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/*
 * GridLayout
 */
public class GridLayoutDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("GridLayout");
		/*
		 * 创建一个4行5列,水平与垂直间距为5的布局
		 */
		frame.setLayout(new GridLayout(4,5,5,5));
		Button[] btns = new Button[20];
		for(int i=1;i<=20;i++){
			btns[i-1] = new Button(i+"");
		}
		
		for(int i=0;i<20;i++){
			frame.add(btns[i]);
		}
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
