package book;

import java.io.FileInputStream;
import java.io.IOException;

public class AccessException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			//e.printStackTrace();
			//return ;
			System.exit(1);
		}
		finally{
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			System.out.println("执行finally块里的资源回收");
			
		}
	}

}
