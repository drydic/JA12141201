import java.util.*;
public class SanMuTest{
	public static void main(String args[]){
		System.out.println("������ɼ���");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score>100||score<0){
			System.out.println("���벻�Ϸ����������˳���");
			return ;
		}else{
			String type=score<60 ? "������":"����";
			System.out.println(type);
			}
		int x = -100;
		int flag = x>0?1:(x==0?0:-1);
		System.out.println("flag=" + flag);
	}
}