package se1.day02.snake;

import java.util.LinkedList;

public class Worm {
	/*
	 * 定义蛇身体的关节集合
	 * 此集合使用了泛型,约束当前集合的元素只能存放Node类型实例
	 */
	private LinkedList<Node> nodes = new LinkedList<Node>();
	
	//蛇当前的行走方向
	private int dir;
	
	public static final int UP = -10;
	public static final int DOWN = 10;
	public static final int LEFT = -1;
	public static final int RIGHT = 1;
	
	public Worm(){//无参构造方法
			nodes.add(new Node(2,12));
			nodes.add(new Node(3,12));
			nodes.add(new Node(4,12));
			nodes.add(new Node(4,13));
			nodes.add(new Node(4,14));
			nodes.add(new Node(5,14));
			nodes.add(new Node(6,14));
			dir = Worm.RIGHT;//默认向右走
	}
	
	public Worm(LinkedList<Node> nodes){//有参构造方法
		this.nodes = nodes;
//		清空蛇的所有元素,将给定的集合中的内容添加到蛇的集合中
//		this.nodes.clear();//清空集合元素
//		this.nodes.addAll(nodes);
	}
	
	/* 蛇沿当前方向前进一步
	 * 1 获取蛇的当前头部坐标
	 * 2 计算下一步的坐标,并创建一个Node实例
	 * 3 将代表下一步坐标的Node实例添加到蛇的集合的第一个位置
	 * 4 将蛇的集合的最后一个元素删除
	 */
	public void step(){
		//1
//		Node first = this.nodes.get(0);
		Node first = this.nodes.getFirst();
		//2
		int i = first.getI() + dir/10;//10 -10 1 -1
		int j = first.getJ() + dir%10;//10 -10 1 -1
		Node head = new Node(i,j);//创建移动一步以后的脑袋坐标
		//3
		this.nodes.addFirst(head);
		//4
		this.nodes.removeLast();
//		this.nodes.remove(this.nodes.size()-1);
	}
	/* 根据给定方法移动一步
	 * @param dir
	 * 1 判断当前方向是否与给定方向位反方向
	 * 2 设置蛇的方向
	 * 3 调用step()方法,按照刚刚设置的方向移动一步
	 */
	public void step(int dir){
		//1
		if((this.dir + dir) == 0){
			System.out.println("不能掉头走!!");
		}else{
			//2
			this.dir = dir;
			//3
			this.step();
		}
	}
	
	/* 判断给定的坐标i与j是不是当前蛇的一个关节
	 * 1 将给定的i和j用以个Node对象表示
	 * 2 判断这个Node对象在蛇的集合中是否存在
	 * @param i
	 * @param j
	 * @return true:是 false:不是
	 */
	public boolean contains(int i,int j){
		//1
		Node node = new Node(i,j);
		//2
		return this.nodes.contains(node);
	}
}
