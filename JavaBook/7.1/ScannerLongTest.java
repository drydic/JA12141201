import java.util.*;
public class ScannerLongTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//in.useDelimiter("\n");
		while(in.hasNextLong()){
			System.out.println("键盘输入的内容是：" + in.nextLong());
		}
	}
}