package se1.day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 异常
 */
public class ExceptionDemo {
	public static void main(String[] args){
//		Card card = null;
		Card card = new Card();
		/*
		 * jvm创建NullPointerException实例并抛出
		 * 若外面没有try catch块捕获,会将异常抛出到方法外
		 * 若有try catch会将空指针异常实例顺序调用catch块,寻找解决
		 */
//		card.setRank(Card.TEN);
//		System.out.println("hello!!!");
		
		
		try{//这里会引发空指针异常
			card.setRank(Card.TEN);
			
			List list = new LinkedList();
			ArrayList a1 = (ArrayList)list;//抛出ClassCastException
			
			System.out.println("hello!!!");
		}catch(NullPointerException e){
//			e.printStackTrace();
			System.out.println("这里有个空指针异常");
		}catch(ClassCastException e){
			System.out.println("不能这样造型");
		}catch(IndexOutOfBoundsException e){
			System.out.println("数组越界了");
		}catch(Exception e){
			System.out.println("反正是出了个错");
		}
		System.out.println("程序执行完了");
	}
}
