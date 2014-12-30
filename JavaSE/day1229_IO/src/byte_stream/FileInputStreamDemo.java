package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	
	public static void main(String[] args) throws IOException {
		//1.�����ļ�����
		File file = new File("./src/byte_stream/FileInputStreamDemo.java");
		//����������
		FileInputStream fis = new FileInputStream(file);
		//IO����
//		int ch = 0;
//		while ((ch = fis.read())!=-1) {
//			
//			System.out.print((char)ch);
//		}
		byte[] buf = new byte[1024];
		int size = 0;
//		len = fis.read(buf);
//		System.out.println(new String(buf, 0, len-4));
		while((size = fis.read(buf))!=-1){
			//System.out.println(new String(buf));
			System.out.println(new String(buf,0,size));
		}
		
		//�ر���
		fis.close();
		
	}

}