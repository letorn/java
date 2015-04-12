package se2.day06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
 * 
 */
public class MyFrame {
	public static Graphics g = null;
	public static void main(String[] args) {
		Frame frame = new Frame();
		Panel panel = initColorButton();
		frame.add(panel,BorderLayout.NORTH);
		frame.setSize(400,400);
		frame.setVisible(true);
		
//		获取窗口的画布
		g = frame.getGraphics();
		//获得鼠标移动事件
		frame.addMouseMotionListener(new MouseMotionListener(){
//			当鼠标在窗口中拖拽时调用此方法
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();//获得鼠标当前的x坐标
				int y = e.getY();
				g.drawRect(x, y, 1, 1);//在指定的x,y位置画长1像素高1像素的矩形
			}
			
//			当鼠标在窗口中移动时调用此方法
			public void mouseMoved(MouseEvent e) {
				
			}
		});
	}
	
	/*
	 * 此方法创建一个Panel,这个Panel中有三个按钮
	 *  每个按钮都有一个单击事件,每当点击某按钮后,就相应的把画布类的颜色改变
	 * @return
	 */
	public static Panel initColorButton(){
		Panel panel = new Panel();
		
		panel.setBackground(Color.WHITE);
		
		Button red = new Button("红");
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				g.setColor(Color.RED);
			}
		});
		
		Button blue = new Button("蓝");
		blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				g.setColor(Color.BLUE);
			}
		});
		
		Button black = new Button("黑");
		black.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				g.setColor(Color.BLACK);
			}
		});
		
		panel.add(red);
		panel.add(blue);
		panel.add(black);
		
		return panel;
	}
}
