package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 容器  ： 数组---->集合
 * asList:使数组可以使用集合的高级方法，不需要手动实现。但是，不支持增删操作，因为数组的长度固定
 */
public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run1();
	}
	public static void run1(){
		String[] str = {"baidu","google","alibaba"};
		System.out.println(str[0]);
		System.out.println(Arrays.toString(str));
		for (String string : str) {
			System.out.println(string);
		}
//		//判断数组中是否有某个元素？
//		System.out.println("jack是否存在：" + isExist(str, "jack"));
		List<String> list = Arrays.asList(str);
		System.out.println("baidu是否存在：" + list.contains("baidu"));
//		list.add("jack");
		
		
	}
	public static boolean isExist(String[] arr,String str) {
		for (String e : arr) {
			if (e.equals(str)) {
				return true;
			}
		}
		return false;
	}
}
