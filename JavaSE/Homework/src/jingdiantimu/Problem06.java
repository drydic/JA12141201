/*
 * ��Ŀ����������������m��n���������Լ������С��������   
 * ��ѭ���У�ֻҪ����������0���ýϴ������Խ�С��������С��һ������Ϊ��һ��ѭ���Ĵ���
 * ��ȡ�õ�������Ϊ��һ��ѭ���Ľ�С���������ѭ��ֱ����С������ֵΪ0�����ؽϴ������
 * ������Ϊ���Լ������С������Ϊ����֮���������Լ����
 */

package jingdiantimu;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����������");
		int m = in.nextInt();
		System.out.println("��������һ����������");
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
		System.out.println("�����������Լ���ǣ�"+m + "����С��������" + sum/m);
		in.close();
	}

}
