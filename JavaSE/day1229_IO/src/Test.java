import java.io.FileWriter;
import java.io.IOException;

//文件中对于异常的处理
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 字符输出流
		FileWriter fw = null;
		try {
			fw = new FileWriter("baidu.txt");
			fw.write("百度杀毒");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
