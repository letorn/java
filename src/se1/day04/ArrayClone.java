package se1.day04;

import java.util.ArrayList;
import java.util.List;

/* 集合的复制
 *   集合复制 java中默认的复制规则为浅表(浅层)复制
 *   只复制集合本身,集合内的元素不复制
 *   
 *   1 调用集合对象的clone()
 *       clone()方法是定义在Object中的
 *   2 使用集合的[复制构造器]
 *       是否复制构造器不但可以做到浅表复制,还可以方便的在不同
 *       集合类型间来回转换
 *       注意:集合Collection不能直接转换为Map
 */
public class ArrayClone {
	public static void main(String[] args){
//		若使用List接收ArrayList,看不到clone()方法
//		List<Card> cards = new ArrayList<Card>();
		ArrayList<Card> cards = new ArrayList<Card>();
		
		cards.add(new Card(Card.CLUB,Card.JACK));
		cards.add(new Card(Card.CLUB,Card.QUEEN));
		cards.add(new Card(Card.CLUB,Card.KING));
		
		/* 若想引用Object的clone()方法,应使用具体类作为引用类型变量
		 * 若使用List这个接口去接收ArrayList对象的话,我们是看不到Object所定义的clone()方法的.因为List是接口(interface),
		 *  接口是不会继承Object类的,自然在List中就没有clone()方法的字义
		 */
		//1 使用Object类的clone()方法进行复制
		ArrayList<Card> clone = (ArrayList<Card>)cards.clone();
		
		//判断原集合的第一个元素和复制后集合的第一个元素是否为同一个
		boolean isOne = cards.get(0) == clone.get(0);
		System.out.println("两个集合第一个元素是否为同一个" + isOne);
		
		//判断两个集合是否为同一个集合
		boolean yn = cards == clone;
		System.out.println("两个集合是否为同一个:" + yn);
	}
}
