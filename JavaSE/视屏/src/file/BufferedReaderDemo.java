package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("buf.txt");
		BufferedReader bufr = new BufferedReader(fr);
		String line = null;
		while ((line = bufr.readLine())!=null) {
			System.out.println(line);
		}
		
		
		bufr.close();
		
	}

	/**
	 * @return 
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("buf.txt");
		char[] a = new char[1024];
		int len = 0;
		while ((len = fr.read(a))!=-1) {
			System.out.println(new String(a, 0, len))   ;
		}	
		fr.close();
	}

}
