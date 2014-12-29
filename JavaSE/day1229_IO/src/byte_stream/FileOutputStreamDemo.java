package byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//1.创建File对象 创建流对象
		FileInputStream fis = new FileInputStream("./src/byte_stream/FileOutputStreamDemo.java");
		FileOutputStream fos = new FileOutputStream("out.txt");
		
		//IO：写操作
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf))!=-1) {
			fos.write(buf);
			System.out.println(new String(buf,0,len));
		}
//		while ((len=fis.read())!=-1) {
//			fos.write(len);
//		}
		
//		fis.close();
//		fos.close();
		
	}

}
