package file;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo2 {

	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		/*
		 * 使用read(char[])读取文本文件数据。
		 * 
		 * 先创建字符数组
		 */
		char[] buf = new char[1024];
		
		int num = 0;
		while((num = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, num));
		}
		
		fr.close();
	}

}
