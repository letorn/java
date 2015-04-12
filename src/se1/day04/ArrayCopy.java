package se1.day04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/* 集合复制
 * 使用复制构造器复制集合
 */
public class ArrayCopy {
	public static void main(String[] args) {
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card(Card.CLUB,Card.JACK));
		cards.add(new Card(Card.CLUB,Card.QUEEN));
		cards.add(new Card(Card.CLUB,Card.KING));
		/* 使用ArrayList的带参数的构造器
		 * 参数:集合对象,参数类型:Collection
		 * 作用:生成一个新集合,并将参数传递进来得集合中的元素放入刚生成的集合中
		 * 效果:浅表复制
		 */
		ArrayList<Card> clone = new ArrayList<Card>(cards);
		System.out.println(cards == clone);//false
		System.out.println(cards.get(0) == clone.get(0));//true
		/* 在所有的集合 ,都有[复制构造器]
		 * 而复制构造器的参数是Collection,换句话说,参数是多态的
		 * 所以,我们可以在不同的集合之间转换
		 */
		//将ArrayList集合转换为一个LinkedList
		LinkedList<Card> link = new LinkedList<Card>(cards);
//		将ArrayList集合转换为一个HashSet
		HashSet<Card> set = new HashSet<Card>(cards);
	}

}
