/*
 * ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
 * ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
 */
package jingdiantimu;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������a��ֵ��");
		int n = in.nextInt();
		System.out.println("��������ӵĸ�����");
		int m = in.nextInt();
		int b = n;
		int sum = 0;
		for (int i = 1; i <= m; i++) {
			sum = sum + n;
			n = b + n*10;
		}
		System.out.println("sum = " + sum);
		in.close();
	}

}