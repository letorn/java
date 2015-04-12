package se2.day04.snake;

import java.util.Scanner;

public class WormRunning {
	public static void main(String[] args) {
		final WormPane wormPane = new WormPane();
		final Worm worm = wormPane.getWorm();
		
		Thread run = new Thread(){
			public void run(){
				while(true){
					worm.step();
					wormPane.print();
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		run.setDaemon(true);
		Thread step = new Thread(){
			public void run(){
				Scanner sc = new Scanner(System.in);
				while(true){
					String dir = sc.nextLine();
					if(dir.equalsIgnoreCase("w")){//上
						worm.step(Worm.UP);
					}
					if(dir.equalsIgnoreCase("s")){//下
						worm.step(Worm.DOWN);
					}
					if(dir.equalsIgnoreCase("a")){//左
						worm.step(Worm.LEFT);
					}
					if(dir.equalsIgnoreCase("d")){//右
						worm.step(Worm.RIGHT);
					}
					if(dir.equalsIgnoreCase("q")){//退出
						break;
					}
					wormPane.print();
				}
			}
		};
		System.out.println("按回车开始");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		wormPane.print();
		run.start();
		step.start();
	}
}
