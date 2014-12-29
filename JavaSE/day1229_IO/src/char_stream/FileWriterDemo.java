package char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * File对象
 * 流对象：		操作文件内容
 */
public class FileWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");
		//写入缓冲区
		fw.write("流对象：操作文件内容\r\ngoogle android");
		//文件已经存在：覆盖
		fw.write("Gmail");
		
		//fw.flush();
		
		FileWriter fw2 = new FileWriter("file_append",true);
		fw2.write("google");
		fw2.write("Gmail");
		
		fw.close();
		fw2.close();
	}

}
