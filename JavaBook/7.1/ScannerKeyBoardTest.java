import java.util.*;
public class ScannerKeyBoardTest{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		//增加下面一行将只把回车作为分隔符
		//in.useDelimiter("\n");
		//判断是否还有下一个输入项
		while(in.hasNext()){
			System.out.println("键盘输入的内容：" + in.next());
		}
	}
}