package file;

import java.io.FileWriter;
import java.io.IOException;

public class IOEAndWriterxceptionDemo {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("xixi\r\nHAHA");
		} catch (IOException e) {
			System.out.println(fw.toString());
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("�ر�ʧ��");
				}
		}

	}

}
