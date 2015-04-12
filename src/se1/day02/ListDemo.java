package se1.day02;

import java.util.ArrayList;
import java.util.List;

/* 集合运算
 * 和(合并集合)
 * 差
 * 交集
 * 空集
 */
public class ListDemo {
	public static void main(String[] args){
		List cards = new ArrayList();
		cards.add(new Card(Card.SPADE,Card.JACK));
		cards.add(new Card(Card.SPADE,Card.QUEEN));
		cards.add(new Card(Card.SPADE,Card.KING));
		cards.add(new Card(Card.SPADE,Card.TEN));
		cards.add(new Card(Card.SPADE,Card.ACE));
		System.out.println(cards);
		List other = new ArrayList();
		other.add(new Card(Card.CLUB,Card.DEUCE));
		other.add(new Card(Card.CLUB,Card.ACE));
		System.out.println(other);
		/* 合并集合元素:将一个集合中的元素全部放入另一个集合中
		 * addAll(Collection c) 将一个集合的所有元素存入当前集合
		 */
		//cards.addAll(other);//将other的元素存入cards
		cards.addAll(1, other);
		System.out.println(cards);
		
		/* 差 从一个集合删除另一个集合中也有的元素
		 * removeAll(Collection c)
		 */
		
		cards.removeAll(other);//将cards中包含other的元素删除
		System.out.println(cards);
		
		/* 取交集 保留一个集合中与另一个集合中都存在的元素
		 * retainAll(Collection c)
		 */
		
		cards.retainAll(other);//保留card里other中存在的元素
		System.out.println(cards);
		
		/* 判断空集 判断一个集合中是否还包含元素
		 *  isEmpty()
		 */
		boolean isEmpty = cards.isEmpty();
		System.out.println("cards是否位空集?" + isEmpty);
		
		/* 空集和null是两码事!
		 *  空集:集合中是否还包含元素
		 * null:没有集合
		 */
		
		cards = null;
		//cards.isEmpty();//会报空指针异常
	}
}
