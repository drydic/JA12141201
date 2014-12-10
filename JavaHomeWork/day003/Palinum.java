/*用户从键盘输入一个1-9999之间的数，
程序将判断这个数是几位数，
并判断这个数是否是回文数。*/

import java.util.*;
public class Palinum{
	public static void main(String args[]){
		System.out.println("请输入一个数：");
		Scanner in = new Scanner(System.in);
		int Temp = in.nextInt();
		int a,b,c,d,e;
		while(Temp < 1 || Temp > 9999){
			System.out.println("输入不合法，请重新输入：");
			Temp = in.nextInt();
			}
		if(Temp<=9999&&Temp>=1000){
			System.out.println("这个数是四位数。");
			a = Temp/1000;
			b = Temp%1000/100;
			c = Temp%100/10;
			d = Temp%10;
			e = d*1000+c*100+b*10+a;
			if(e==Temp){
				System.out.println("这个数是回文数。");
			}else{
				System.out.println("这个数不是回文数。");
			}
		}else if(100<=Temp&&Temp<1000){
			System.out.println("这个数是三位数。");
			b = Temp/100;
			c = Temp%100/10;
			d = Temp%10;
			e = d*100+c*10+b;
			if(e==Temp){
				System.out.println("这个数是回文数。");
			}else{
				System.out.println("这个数不是回文数。");
			}
		}else if(10<=Temp&&Temp<100){
			System.out.println("这个数是两位数。");
			c = Temp/10;
			d = Temp%10;
			e = d*10+c;
			if(e==Temp){
				System.out.println("这个数是回文数。");
			}else{
				System.out.println("这个数不是回文数。");
			}
		}else{
			System.out.println("这个数是一位数。");
			System.out.println("这个数不是回文数。");
		}
	}
}