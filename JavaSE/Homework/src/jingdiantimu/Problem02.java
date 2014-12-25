/*
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
 * 如果能被整除， 则表明此数不是素数，反之是素数。   
 */
package jingdiantimu;

import java.util.ArrayList;
import java.util.List;

public class Problem02 {

	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 101; i <= 200; i++) {
			if (isPrime(i)) {
				list.add(i);
				System.out.println(i);
			}
		}
		System.out.println("总共有：" + list.size() + "素数");
	}
	private static boolean isPrime(int i) {
		boolean flag = true;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				flag = false;
			}
		}
		return flag;
	}

}
