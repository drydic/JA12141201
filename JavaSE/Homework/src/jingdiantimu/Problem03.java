package jingdiantimu;
/**
 * ������3��   ��Ŀ����ӡ�����е� "ˮ�ɻ��� "��
 * ��ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
 * ���磺153��һ�� "ˮ�ɻ��� "��
 * ��Ϊ153=1�����η���5�����η���3�����η���
 */

public class Problem03 {

	
	public static void main(String[] args) {
		int a,b,c;
		for (int i = 100; i < 999; i++) {
			a = i/100;
			b = i/10%10;
			c = i%10;
			if (a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i);
			}
		}
	}

}
