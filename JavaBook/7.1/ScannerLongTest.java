import java.util.*;
public class ScannerLongTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//in.useDelimiter("\n");
		while(in.hasNextLong()){
			System.out.println("��������������ǣ�" + in.nextLong());
		}
	}
}