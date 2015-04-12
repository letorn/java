package se1.day03.snake;
/* 描述画面中的某个点
 * 
 */
public class Node {
	private int i;
	private int j;
	
	public Node(){//无参构造器
		
	}
	public Node(int i,int j){//给定坐标创建点
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public String toString(){
		return "["+this.i+","+this.j+"]";//[3,4]
	}
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(this == obj) return true;
		if(obj instanceof Node){
			Node node = (Node)obj;
			return this.i==node.i && this.j==node.j;
		}
		return false;
	}
	public int hashCode(){
		return (i<<16)|j;
	}
}
