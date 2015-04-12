package se2.day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 对象序列化2
 */
public class CardIO {
	public static void main(String[] args) throws Exception{
		List<Card> cards = new ArrayList<Card>();
		cards.add(new Card(Card.SPADE,Card.ACE));
		cards.add(new Card(Card.SPADE,Card.KING));
		cards.add(new Card(Card.SPADE,Card.QUEEN));
		cards.add(new Card(Card.SPADE,Card.JACK));
		cards.add(new Card(Card.SPADE,Card.TEN));
		
		FileOutputStream fos = new FileOutputStream("cards.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cards);//将集合cards持久化(序列化+写入磁盘)
		
		oos.flush();
		oos.close();
		fos.close();
		
		//反序列化操作
		FileInputStream fis = new FileInputStream("cards.obj");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//虽然使用多态接收,但实际反序列化回来的是ArrayList的实例
		List<Card> others = (List<Card>)ois.readObject();
		
//		List<Card> a = new ArrayList<Card>j
		
		System.out.println(cards);//原集合
		System.out.println(others);//反序列化后还原的集合
		//集合元素是否包含
		System.out.println(cards.containsAll(others));
		System.out.println(cards==others);
		System.out.println(cards.get(0) == others.get(0));
		System.out.println(cards.get(0).equals(others.get(0)));
	}
}
