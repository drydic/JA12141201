package char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * File����
 * ������		�����ļ�����
 */
public class FileWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");
		//д�뻺����
		fw.write("�����󣺲����ļ�����\r\ngoogle android");
		//�ļ��Ѿ����ڣ�����
		fw.write("Gmail");
		
		//fw.flush();
		
		FileWriter fw2 = new FileWriter("file_append",true);
		fw2.write("google");
		fw2.write("Gmail");
		
		fw.close();
		fw2.close();
	}

}