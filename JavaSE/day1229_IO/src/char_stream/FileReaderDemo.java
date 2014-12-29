package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//文件输入流：文件必须存在否则：异常
		FileReader fr =new FileReader("new.txt");
		FileWriter fw = new FileWriter("jack.txt");
//		int ch = 0;
//		while ((ch = fr.read())!= -1) {
//			System.out.print((char)ch);
//			fw.write(ch);
//			fw.flush();
//		}
		char[] buf = new char[1024];
		int len = 0;
		while ((len = fr.read(buf))!=-1) {
			System.out.println(new String(buf));
			fw.write(buf);
			fw.flush();
		}
		
		
		fr.close();
		fw.close();
	}

}
