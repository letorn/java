package se2.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 对象深层复制
 */
public class ObjectDeepCopy {
	public static void main(String[] args) throws Exception {
		List<Card> cards = new ArrayList<Card>();
		cards.add(new Card(Card.SPADE,Card.ACE));
		
		List<Card> others = (List<Card>)deepCopy(cards);
		
		System.out.println(cards);
		System.out.println(others);
		System.out.println(cards == others);
		System.out.println(cards.get(0) == others.get(0));
	}

	/**
	 * 深层复制
	 * 
	 * @param object
	 * @return
	 */
	public static Object deepCopy(Object object) throws Exception{
		/*
		 * 创建一个输出流,输出的位置为一个字节数组
		 * ByteArrayOutputStream内部维护着一个字节数组,会自动扩容
		 * 所有通过这个输出流写出的数据都被保存在了这个数组中.也可以通过调用此输出流的toByteArray()方法获得此数组
		 */
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(object);//把参数序列化并写入到字节数组中
		
		oos.flush();
		oos.close();
		
		//获取ByteArrayOutputStream中的字节数组
		byte[] data = baos.toByteArray();
		
		//反序列化操作
		/*
		 * ButeArrayInputStream对象在创建的时候需要给定一个字节数组
		 * 那么从这个数组中读取字节就相当于从给定的字节数组中读取字节
		 */
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object obj = ois.readObject();//反序列化
		ois.close();
		bais.close();
		return obj;
	}
}
