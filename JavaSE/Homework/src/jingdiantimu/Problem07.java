/*
 * ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 */

package jingdiantimu;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = in.nextLine();
		char a[] = s.toCharArray();
		int x=0,y=0,z=0,w=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z') {
				x++;
			}else if(a[i]>='0'&&a[i]<='9'){
				z++;
			}else if (a[i] == ' ') {
				y++;
			}else{
				w++;
			}			
		}
		System.out.println("Ӣ����ĸ�ĸ�����" + x);
		System.out.println("��  ��  ��  �� ����" + y);
		System.out.println("��  ��  ��  �� ����" + z);
		System.out.println("�����ַ��ĸ�����" + w);
		in.close();
	}

}