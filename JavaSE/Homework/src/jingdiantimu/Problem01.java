package jingdiantimu;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӷ���������ÿ���µ���������Ϊ���٣�   
 */
public class Problem01 {

	
	public static void main(String[] args) {
		
//		long a1 = 1;
//		long a2 = 1;
//		long a3;
//		System.out.println(a1 + "   " + a2);
//		for (int i = 3; i <= 100; i++) {
//			a3 = a1+a2;
//			a1 = a2;
//			a2 = a3;
//			System.out.println("��" + i+ "���µ�����Ϊ��" + a3);
//		}
		
		
		
		
		
		
		Problem01 p1 = new Problem01();
		for (int i = 1; i <= 100; i++) {
			System.out.println("��" + i + "�������ӵ�����Ϊ��" + p1.fun(i));
		}
		
	}
	public long fun(long n) {
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 1;
		}else {
			return fun(n-1) + fun(n-2);
		}
	}

}