package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * System.in	����		setIn(InputStream)
 * System.out	��Ļ		setOut(PrintStream)
 * System.err	��Ļ		setErr(PrintSteam)
 */
public class RedirStdio {

	public static void main(String[] args) {
//		PrintStream ps = null;
//		try {
//			ps = new PrintStream(new FileOutputStream("redir.txt"));
//			//System.out----->ps
//			
//			System.out.println("�ض���֮ǰ����ӡ���ն�");
////			System.setOut(ps);
//			System.out.println("�ض���֮�󣺴�ӡ���ļ�");
//			System.out.println(new Object());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			ps.close();
//		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("redir.txt");
			System.out.println(fis);
			
			//ʹ��System.in���󹹽�Scanner��������ȡ����
			Scanner scanner = new Scanner(System.in);
		
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				System.out.println("�ļ��������ݣ�" + scanner.next());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}