package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("IO��.txt");
		FileWriter fw = new FileWriter("��һ��.txt");
		int ch = 0;
		while((ch = fr.read())!=-1){
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
