package se1.day03.snake;

import java.util.Scanner;

/*
 * 贪食蛇游戏主类
 */
public class WormDemo {
	public static void main(String[] args){
		//创建界面
		WormPane wormPane = new WormPane();
		//从界面中获取对应的蛇
		Worm worm = wormPane.getWorm();
		//画一帧
		wormPane.print();
		Scanner scanner = new Scanner(System.in);
		while(true){
			String dir = scanner.nextLine();
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
}
