package se2.day04.snake;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 游戏界面
 * 
 */
public class WormPane {
	private Worm worm;//界面上的蛇
	private Set<Node> foods = new HashSet<Node>();//豆子
	private int row = 11;//界面的行数
	private int col = 27;//界面的列数
	//创建界面
	public WormPane(){
		worm = new Worm();//创建一条蛇
		initFoods(5);//初始化豆子
	}
	//获取界面里的蛇
	public Worm getWorm(){
		return this.worm;
	}
	
	/* 初始化豆子
	 * 1 随机获取界面上的i,j坐标,并创建对应的Node对象
	 * 2 判断生成的坐标不应是蛇的身体
	 * 3 判断生成的坐标不是已经存在的豆子
	 * 4 将生成的这个新豆子添加到foods集合中
	 */
	private void initFoods(int maxFoods){
//		int sum = 0;//已经生成的豆子数量
		Random random = new Random();
		while(true){
			if(foods.size() >= maxFoods){
				break;
			}
			//1
			int i = random.nextInt(row-2)+1;
			int j = random.nextInt(col-2)+1;
			Node food = new Node(i,j);
			//2
			if(worm.contains(i, j)){
				continue;
			}
			//3
			if(foods.contains(food)){
				continue;
			}
			//4
			foods.add(food);
//			sum++;//sum的值和foods.size()的值一相等
		}
	}
	
	//画一遍界面
	public void print(){
		//循环行
		for(int i=0;i<row;i++){
			//循环列
			for(int j=0;j<col;j++){
				if(i==0 || i==row-1){
					System.out.print("-");//千万别回行
				}else if(j==0 || j==col-1){
					System.out.print("|");
				//当前i,j坐标是不是蛇的一个关节
				}else if(worm.contains(i, j)){
					System.out.print("#");
				//当前i,j坐标是不是豆子	
				}else if(foods.contains(new Node(i,j))){
					System.out.print("O");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();//一行内容都画完后要回行
		}
	}
}
