import java.util.*;
public class Home2{
	public static void main(String args[]){
		System.out.println("*******************************");
		System.out.println("|     1.����1��ѧ��           |");
		System.out.println("|     2.��ʾ����ѧ��          |");
		System.out.println("|     3.�˳�����              |");
		System.out.println("|     ������ѡ��(1-3):        |");
		System.out.println("*******************************");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch(choice){
			case 1:
			System.out.println("����1��ѧ��!");
			break;
			case 2:
			System.out.println("��ʾ����ѧ��!");
			break;
			default:
			break;
		}
		}
}