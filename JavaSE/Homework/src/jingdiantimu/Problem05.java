/*
 * ��Ŀ�����������������Ƕ������ɴ��⣺
 * ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��   
 */


package jingdiantimu;

import java.util.Scanner;

public class Problem05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��1-100֮���������");
		int i = in.nextInt();
		char x = (i>=90)?'A':(i>=60&&i<=89)?'B':'C';
		System.out.println(x);		
		in.close();		
	}

}