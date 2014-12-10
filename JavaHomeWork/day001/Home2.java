import java.util.*;
public class Home2{
	public static void main(String args[]){
		System.out.println("*******************************");
		System.out.println("|     1.增加1个学生           |");
		System.out.println("|     2.显示所有学生          |");
		System.out.println("|     3.退出程序              |");
		System.out.println("|     请输入选择(1-3):        |");
		System.out.println("*******************************");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch(choice){
			case 1:
			System.out.println("增加1个学生!");
			break;
			case 2:
			System.out.println("显示所有学生!");
			break;
			default:
			break;
		}
		}
}