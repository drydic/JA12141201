package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * Map的基本使用
 */
public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		//增加元素
		map.put(null, null);
		map.put(null, null);
		System.out.println(map.put(123, "Google"));//key不存在  返回null
		System.out.println(map.put(123, "Apple"));//put 返回key上次对应的value
		map.put(321, "Baidu");
		map.put(12, "Alibaba");		
		System.out.println(map);
		
		//删除元素
//		System.out.println(map.remove(1));//key不存在时返回null
////		System.out.println(map.remove(12));//key存在  移除键值，并返回value
//		System.out.println(map);
//		
////		map.clear();
////		System.out.println(map);
//		
//		//判断
//		if (map.containsKey(12)) {
//			System.out.println("key存在！");
//		}else {
//			System.out.println("key不存在");
//		}
//		
//		if (map.containsValue("badui")) {
//			System.out.println("value存在！");
//		}else {
//			System.out.println("value不存在!");
//		}
//		
//		if (map.isEmpty()) {
//			System.out.println("map空");
//		}else {
//			System.out.println("map非空：" + map.size());
//		}
//		
//		//获取
//		System.out.println(map.get(321));
//		System.out.println(map.get(1235));
		
		/*
		 * 遍历操作：map没有迭代器
		 * a、得到key的set集合
		 * b、使用该set集合的迭代器，去遍历
		 * c、使用get+迭代器==遍历value
		 */
//		Set<Integer> key_set = map.keySet();
//		Iterator<Integer> it = key_set.iterator();
//		while (it.hasNext()) {
//			Integer integer = (Integer) it.next();
//			System.out.println(map.get(integer));
//		}
//		
//		Collection<String> value_coll = map.values();
//		Iterator<String> ts = value_coll.iterator();
//		while (ts.hasNext()) {
//			//String string = ts.next();
//			System.out.println(ts.next());
//		}
		/*
		 * 使用entrySet()把map集合转换成set集合，使用迭代器迭代：
		 * Map.Entry类型：映射项=键值对【键-值】
		 */
		Set<Map.Entry<Integer, String>> entry_set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> ts = entry_set.iterator();
		while (ts.hasNext()) {
			Map.Entry<Integer, String> entry = ts.next();
			//System.out.println(entry);//默认调用entry.toString()
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:" + key + "\tvalue:" + value);
		}
		
		
		
	}
}
