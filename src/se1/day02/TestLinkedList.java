package se1.day02;

import java.util.LinkedList;
import java.util.List;

/* 测试LinkedList
 * 
 */
public class TestLinkedList {
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.add(new Card(Card.SPADE,Card.TEN));
		list.add(new Card(Card.SPADE,Card.JACK));
		list.add(new Card(Card.SPADE,Card.QUEEN));
		list.add(new Card(Card.SPADE,Card.KING));
		System.out.println(list);//同花顺
		
		list.remove(3);
		Card k = new Card(Card.SPADE,Card.KING);
		list.remove(k);
		
		/* 获取集合元素数量
		 * List的size()方法返回值为:当前集合的元素数量
		 */
		System.out.println("集合中有:" + list.size() +"个元素");
		//向集合头部添加新元素
		list.addFirst(new Card(Card.CLUB,Card.DEUCE));
//		向集合尾部添加新元素
		list.addLast(new Card(Card.CLUB,Card.ACE));
		System.out.println(list);
	}
}
