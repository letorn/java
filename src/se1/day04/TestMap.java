package se1.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/* Map的迭代
 * 对key:value成对迭代 map.entrySet();
 *                   返回一个Set集合,集合中元素为Entry
 *                   一个Entry中包含一个Key和一个Value
 *                   
 * 对key迭代                    map.keySet();
 *                   返回一个Set集合,集合中的元素为key值
 *                   
 * 对value迭代                map.values();
 *                   返回一个Set集合,集合中的元素为key值
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("1", 1);
		map.put("5", 5);
		map.put("785", 785);
		/*
		 * 根据key:value对迭代
		 * entrySet()返回一个Set,其中的元素是Entry
		 * Entry的实例表示一个Key与一个Value
		 *       Key和Value在Map的泛型中已定义了
		 */
		Set<Entry<String,Integer>> set = map.entrySet();
		
		Iterator<Entry<String,Integer>> it = set.iterator();
		while(it.hasNext()){
			Entry<String,Integer> entry = it.next();
			System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
		}
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIt = keyset.iterator();
		while(keyIt.hasNext()){
			String key = keyIt.next();//获取每一个key
			int value = map.get(key);//从hashmap中根据key取value
			System.out.println("map中key:" + key +",value:" + value);
		}
	}
}
