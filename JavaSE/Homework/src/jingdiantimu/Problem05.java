/*
 * 题目：利用条件运算符的嵌套来完成此题：
 * 学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。   
 */


package jingdiantimu;

import java.util.Scanner;

public class Problem05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个1-100之间的整数：");
		int i = in.nextInt();
		char x = (i>=90)?'A':(i>=60&&i<=89)?'B':'C';
		System.out.println(x);		
		in.close();		
	}

}
