/*
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
 * 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数
 * ，取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，
 * 此数即为最大公约数，最小公倍数为两数之积除以最大公约数。
 */

package jingdiantimu;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int m = in.nextInt();
		System.out.println("请输入再一个正整数：");
		int n = in.nextInt();
		int sum = m * n;
		int temp,temp1;
		if (m < n) {
			temp = m;
			m = n;
			n = temp;
		}
		while (n != 0) {
			temp1 = m%n;
			m = n;
			n = temp1;
		}
		System.out.println("这两数的最大公约数是："+m + "，最小公倍数：" + sum/m);
		in.close();
	}

}
