package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Person;

public class HashMapDemo {
	
	public static void main(String[] args) {
		//Person--City
		HashMap<Person, String> hm = new HashMap<>();
		hm.put(new Person("IBM", 20), "USA");
		hm.put(new Person("Alibaba", 15), "Hangzhou");
		hm.put(new Person("Google", 123), "Sfancisose");
		hm.put(new Person("Baidu", 12), "Beijing");
		hm.put(new Person("Baidu", 12), "hangzhou");
		//System.out.println(hm);
		
		//遍历
		Set<Map.Entry<Person, String>> st = hm.entrySet();
//		Iterator<Map.Entry<Person, String>> it = st.iterator();
//		for (Iterator iterator = st.iterator(); iterator.hasNext();) {
//			Map.Entry<Person, String> entry =  (Entry<Person, String>) iterator.next();
//			Person p1 = entry.getKey();
//			String s1 = entry.getValue();
//			System.out.println("name:" + p1.getName() + "\tAge:" + p1.getAge() + "\t城市：" + s1);
//			//System.out.println(entry);
//		}
//		Iterator<Person> it1 = hm.keySet().iterator();
//		while (it1.hasNext()) {
//			Person person =  it1.next();
//			System.out.println("name:" + person.getName() + "\tAge:" + person.getAge() + "\t城市：" + hm.get(person));
//		}
//		
		for (Entry<Person, String> entry : st) {
			System.out.println(entry);
		}
	}
}
