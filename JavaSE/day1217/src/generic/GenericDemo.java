package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
 * 泛型：在程序中使用<>来指定具体的类型
 * 	可以用在类的定义、接口定义、方法定义、集合
 * 1.把运行时错误，提前到编译时，提早发现错误
 */
public class GenericDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> list = new TreeSet<>();
		//list.add(123);	//把运行时错误，提前到编译时，提早发现错误
		list.add("Google");
		list.add("baidu");
		
		System.out.println(list);
		
//		for (String string : list) {
//			System.out.println(string);
//		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
		}
	}

}
