package se1.day03;

import java.util.ArrayList;
import java.util.HashMap;

/* 测试HashMap
 * 
 */
public class TestHashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		ArrayList list = new ArrayList();
		//存放一些数字
		list.add(1);
		list.add(5);
		list.add(78);
		list.add(785);
		list.add(2654);
		
		//使用map存放数字
		map.put("1", 1);
		map.put("5", 5);
		map.put("78", 78);
		map.put("785", 785);
		map.put("2654", 2654);
		map.put("78", 666);//22行的78会被666覆盖
		
		//从ArrayList中获取值为2654的元素
		for(int i=0;i<list.size();i++){
			int num = ((Integer)list.get(i)).intValue();
			if(num == 2654){
				System.out.println("找到了!找了" + (i+1) +"遍");
			}
		}
		
		//HashMap中获取值为2654的元素
		System.out.println("hash找了一遍:" + map.get("2654"));
		
		map.containsKey("8855");
	}

}
