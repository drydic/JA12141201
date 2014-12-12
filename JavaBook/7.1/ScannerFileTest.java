import java.io.*;
import java.util.*;
public class ScannerFileTest{
	public static void main(String[] args)
		throws Exception{
		
			/* File a = new File("ScannerFileTest.java");
			Scanner in = new Scanner(a); */
			
			
			Scanner in = new Scanner(new File("ScannerFileTest.java"));
			System.out.println("ScannerFileTest.java文件内容是：");
			while(in.hasNextLine()){
				System.out.println(in.nextLine());
			}
		}
	
}