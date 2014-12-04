import java.util.*;
public class SanMuTest{
	public static void main(String args[]){
		System.out.println("请输入成绩：");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score>100||score<0){
			System.out.println("输入不合法！程序已退出！");
			return ;
		}else{
			String type=score<60 ? "不及格":"及格";
			System.out.println(type);
			}
		int x = -100;
		int flag = x>0?1:(x==0?0:-1);
		System.out.println("flag=" + flag);
	}
}