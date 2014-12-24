package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ����  �� ����---->����
 * asList:ʹ�������ʹ�ü��ϵĸ߼�����������Ҫ�ֶ�ʵ�֡����ǣ���֧����ɾ��������Ϊ����ĳ��ȹ̶�
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
//		//�ж��������Ƿ���ĳ��Ԫ�أ�
//		System.out.println("jack�Ƿ���ڣ�" + isExist(str, "jack"));
		List<String> list = Arrays.asList(str);
		System.out.println("baidu�Ƿ���ڣ�" + list.contains("baidu"));
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
