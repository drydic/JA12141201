import java.util.*;
public class ScannerKeyBoardTest{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		//in.useDelimiter("\n");
		//�ж��Ƿ�����һ��������
		while(in.hasNext()){
			System.out.println("������������ݣ�" + in.next());
		}
	}
}