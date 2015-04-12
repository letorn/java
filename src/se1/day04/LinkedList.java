package se1.day04;

public class LinkedList<T> {
	private Node head;//头节点
	public void add(T t){
		if(head == null){//第一次放元素
			head = this.new Node();//创建链表的头
			head.value = t;
			head.prev = head;
			head.next = head;
		}else{
			LinkedList<T>.Node node = this.new Node();//链表的尾巴
			node.prev = head.prev;//为尾巴的上一个是老尾巴
			node.next = head;//新尾巴的下一个是头
			//头的上一个(老尾巴)的下一个是新尾巴
			head.prev.next = node;
			//头的上一个是新尾巴
			head.prev = node;
		}
	}
	
	private class Node{
		public Node prev;//上一个节点
		public Node next;//下一个节点
		public T value;//当前节点保存的元素
	}
}
