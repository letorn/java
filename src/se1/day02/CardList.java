package se1.day02;

import java.util.ArrayList;
import java.util.List;


/* ArrayList练习
 * 
 */
public class CardList {
	public static void main(String[] args){
		List cards = new ArrayList();
		cards.add(new Card(Card.SPADE,Card.ACE));
		cards.add(new Card(Card.SPADE,Card.JACK));
		cards.add(new Card(Card.SPADE,Card.QUEEN));
		cards.add(new Card(Card.SPADE,Card.KING));
		cards.add(new Card(Card.SPADE,Card.TEN));
		System.out.println(cards);//同花顺
		
		//上面的集合做了类似的事情
//		Object[] objs = new Object[5];
//		objs[0] = new Card(Card.SPADE,Card.ACE);
//		Card ace = (Card)objs[0];
		Card card = (Card)cards.get(0);

		//查看List中是否存在 黑桃K
		Card king = new Card(Card.SPADE,Card.KING);
		/* 判断一个元素是否在List中存在,使用contains方法
		 * 些方法会判断给定的元素与集合中每个元素equals是否为true
		 * 若为true,就是包含
		 * 若想做到逻辑意义上的包含,应重写List中元素的equals方法
		 */
		boolean have = cards.contains(king);
		System.out.println("存在么?" + have);
		
		/* 删除元素
		 * 删除元素 黑桃ACE
		 * 
		 * romove 方法有几个重载方法
		 *   remove(int index) 根据给定的下标值删除对应元素,返回值:被删除的元素
		 *   remove(Object obj) 根据给定对象删除list中与给定对象equals为true的元素,返回值:boolean,是否删除成功
		 */
		
//		cards.remove(0);
		Card ace = new Card(Card.SPADE,Card.ACE);
		cards.remove(ace);
		System.out.println(cards);
		System.out.println("删除ace成功:" + cards.remove(ace));
		
		/* List的set方法用于修改元素
		 * set(int index,Object obj) 将List中对应下标index的元素替换为obj
		 */
		//将cards中的黑桃10替换为大王
		Card joker = new Card(Card.JOKER,Card.COLOR);
		Card c = (Card)cards.set(cards.indexOf(new Card(Card.SPADE,Card.TEN)), joker);
		System.out.println("被替换的牌是:" + c);
		System.out.println(cards);
	}
}
