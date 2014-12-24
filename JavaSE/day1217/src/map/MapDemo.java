package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * Map�Ļ���ʹ��
 */
public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		//����Ԫ��
		map.put(null, null);
		map.put(null, null);
		System.out.println(map.put(123, "Google"));//key������  ����null
		System.out.println(map.put(123, "Apple"));//put ����key�ϴζ�Ӧ��value
		map.put(321, "Baidu");
		map.put(12, "Alibaba");		
		System.out.println(map);
		
		//ɾ��Ԫ��
//		System.out.println(map.remove(1));//key������ʱ����null
////		System.out.println(map.remove(12));//key����  �Ƴ���ֵ��������value
//		System.out.println(map);
//		
////		map.clear();
////		System.out.println(map);
//		
//		//�ж�
//		if (map.containsKey(12)) {
//			System.out.println("key���ڣ�");
//		}else {
//			System.out.println("key������");
//		}
//		
//		if (map.containsValue("badui")) {
//			System.out.println("value���ڣ�");
//		}else {
//			System.out.println("value������!");
//		}
//		
//		if (map.isEmpty()) {
//			System.out.println("map��");
//		}else {
//			System.out.println("map�ǿգ�" + map.size());
//		}
//		
//		//��ȡ
//		System.out.println(map.get(321));
//		System.out.println(map.get(1235));
		
		/*
		 * ����������mapû�е�����
		 * a���õ�key��set����
		 * b��ʹ�ø�set���ϵĵ�������ȥ����
		 * c��ʹ��get+������==����value
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
		 * ʹ��entrySet()��map����ת����set���ϣ�ʹ�õ�����������
		 * Map.Entry���ͣ�ӳ����=��ֵ�ԡ���-ֵ��
		 */
		Set<Map.Entry<Integer, String>> entry_set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> ts = entry_set.iterator();
		while (ts.hasNext()) {
			Map.Entry<Integer, String> entry = ts.next();
			//System.out.println(entry);//Ĭ�ϵ���entry.toString()
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:" + key + "\tvalue:" + value);
		}
		
		
		
	}
}