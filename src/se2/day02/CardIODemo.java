package se2.day02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 读写一副扑克牌
 * 1:创建一个集合用于保存所有的牌
 * 2:循环创建所有的牌并放入集合
 * 3:洗牌(打乱集合元素顺序)
 * 4:打开文件输出流FileOutputStream
 * 5:打开高级流DataOutputStream
 * 6:循环集合将每张牌的花色和分值写入
 * 7:关闭流
 * 8:创建一个新的集合,用于保存从文件中读取出的牌
 * 9:打开文件输入流FileInputStream
 * 10:打开高级流DataInputStream
 * 11:循环读取花色和分值并还原一张牌后放入新的集合中
 * 12:关闭流
 */
public class CardIODemo {
	public static void main(String[] args) throws Exception{
		//1
		List<Card> cards = new ArrayList<Card>();
		//2
		//按照每个分值4个花色插入
		for(int rank=Card.THREE;rank <= Card.DEUCE;rank++){
			for(int suit=Card.DIAMOND;suit <=Card.SPADE;suit++){
				cards.add(new Card(suit,rank));
			}
		}
		//插入大小王
		cards.add(new Card(Card.JOKER,Card.BLACK));
		cards.add(new Card(Card.JOKER,Card.COLOR));
		//3
		Collections.shuffle(cards);
		//4
		String fileName = "." + File.separator + "cards.txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		//5
		DataOutputStream dos = new DataOutputStream(fos);
		//6
		for(Card card:cards){
			dos.writeInt(card.getSuit());//写花色
			dos.writeInt(card.getRank());//写分值
		}
		//7
		dos.close();
		fos.close();
		
		IOUtils.printHex(fileName);//输出写出的文件内容
		/*********************************************************************/
		//8
		List<Card> other = new ArrayList<Card>();
		//9
		FileInputStream fis = new FileInputStream(fileName);
		//10
		DataInputStream dis = new DataInputStream(fis);
		
		//11
		/*
		 * 当输入流已经读取到文件末尾,而还要让DataInputStream继续尝试读取某种数据时,会引发EOFException
		 */
		while(true){
			try {
				int suit = dis.readInt();//读取花色
				int rank = dis.readInt();//读取点数
				other.add(new Card(suit,rank));
			} catch (EOFException e) {
				break;//当读取到文件末尾,停止while循环
			}
		}
		System.out.println("读取完毕");
		System.out.println(other);//打印读取到的所有牌
	}
}
