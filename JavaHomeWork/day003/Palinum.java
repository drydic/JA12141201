/*�û��Ӽ�������һ��1-9999֮�������
�����ж�������Ǽ�λ����
���ж�������Ƿ��ǻ�������*/

import java.util.*;
public class Palinum{
	public static void main(String args[]){
		System.out.println("������һ������");
		Scanner in = new Scanner(System.in);
		int Temp = in.nextInt();
		int a,b,c,d,e;
		while(Temp < 1 || Temp > 9999){
			System.out.println("���벻�Ϸ������������룺");
			Temp = in.nextInt();
			}
		if(Temp<=9999&&Temp>=1000){
			System.out.println("���������λ����");
			a = Temp/1000;
			b = Temp%1000/100;
			c = Temp%100/10;
			d = Temp%10;
			e = d*1000+c*100+b*10+a;
			if(e==Temp){
				System.out.println("������ǻ�������");
			}else{
				System.out.println("��������ǻ�������");
			}
		}else if(100<=Temp&&Temp<1000){
			System.out.println("���������λ����");
			b = Temp/100;
			c = Temp%100/10;
			d = Temp%10;
			e = d*100+c*10+b;
			if(e==Temp){
				System.out.println("������ǻ�������");
			}else{
				System.out.println("��������ǻ�������");
			}
		}else if(10<=Temp&&Temp<100){
			System.out.println("���������λ����");
			c = Temp/10;
			d = Temp%10;
			e = d*10+c;
			if(e==Temp){
				System.out.println("������ǻ�������");
			}else{
				System.out.println("��������ǻ�������");
			}
		}else{
			System.out.println("�������һλ����");
			System.out.println("��������ǻ�������");
		}
	}
}