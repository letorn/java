package se2.day06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 事件机制
 * 步骤:
 * 1:定义用于监听某种事件的监听器
 * 2:为某个组件加入此监听器,以监听当前组件触发的这个事件
 * 3:当组件触发此事件,监听器会执行其相应方法来响应事件
 */
public class EventDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("按钮事件");
		Button button = new Button("按钮");
		/*
		 * 创建点击监听器
		 */
		ButtonClickListener bcl = new ButtonClickListener();
		/*
		 * 给按钮注册监听器
		 */
		button.addActionListener(bcl);
		
		final Button button2 = new Button("按死我吧");
		button2.addActionListener(new ActionListener(){
			private int sum = 0;
			public void actionPerformed(ActionEvent e){
				button2.setLabel("按了"+sum+"次");
				sum++;
			}
		});
		frame.add(button2,BorderLayout.WEST);
		frame.add(button,BorderLayout.CENTER);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}

/*
 * ActionListener为按钮单击事件的监听器
 * 当某个按钮注册了这个监听器,那么当这个按键被点击一次,当前监听器就会调用自己的actionPerformed()方法响应此事件
 */
class ButtonClickListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("按钮被单击了一次");
	}
}
