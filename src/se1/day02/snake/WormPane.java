package se1.day02.snake;
/* 游戏界面
 * 
 */
public class WormPane {
	private Worm worm;//界面上的蛇
	private int row = 11;//界面的行数
	private int col = 27;//界面的列数
	//创建界面
	public WormPane(){
		worm = new Worm();//创建一条蛇
	}
	//获取界面里的蛇
	public Worm getWorm(){
		return this.worm;
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
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();//一行内容都画完后要回行
		}
	}
}
