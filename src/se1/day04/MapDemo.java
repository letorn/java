package se1.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Map的小应用:统计字数
 */
public class MapDemo {
	public static void main(String[] args){
		String info = "我困了,我睡了,我醒了,我好了";
		Map<Character,Integer> map = count(info);
		//通过map获取key:value(Entry)对的set集合
		Set<Entry<Character,Integer>> entryset = map.entrySet();
		//创建用于迭代Set集合的迭代器
		Iterator<Entry<Character,Integer>> it = entryset.iterator();
		while(it.hasNext()){
			//通过迭代器获取每一个Entry(Map中的每个key:value对)
			Entry<Character,Integer> entry = it.next();
			//输出内容
			System.out.println(entry.getKey() + "出现了" + entry.getValue() + "次");
		}
	}
	
	/**
	 * 统计给定的字符串,以Map形式返回,Map中的key为出现的字符,value为这个字符出现的次数
	 * @param info
	 * @return
	 */
	public static Map<Character,Integer> count(String info){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		//循环info的长度
		for(int i=0;i<info.length();i++){
			//取info中的每一个字符
			//我困了,我睡了,我醒了,我好了
			char c = info.charAt(i);
			//判断c是否以key的形式在map中存在
			Integer value = map.get(c);
			//value两种可能,为null或不为null
			if(value == null){//不存在map中(key不存在)
				map.put(c, 1);
			}else{
				value+=1;
				map.put(c,value);
			}
		}
		return map;
	}
}

