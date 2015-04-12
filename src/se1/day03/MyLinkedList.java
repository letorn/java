package se1.day03;
/*
 * 链表结构
 */
public class MyLinkedList {
	public static void main(String[] args){
		Node head = new Node("黑桃10");
		head.next = new Node("黑桃J");
		head.next.next = new Node("黑桃Q");
		head.next.next.next = new Node("黑桃K");
		System.out.println(head);
	}
}
/* Node代表链表中的一个元素,它应包含两部分内容
 *   1 当前元素要保存的内容
 *   2 下一个元素的引用
 */
class Node{
	Object value;//当前节点要保存的值
	Node next;//下一个节点的地址
	public Node(Object value){
		this.value = value;
	}
	public String toString(){
		return next==null?value.toString():value.toString() + "," + next.toString();
	}
}