import java.io.FileWriter;
import java.io.IOException;

//�ļ��ж����쳣�Ĵ���
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ַ������
		FileWriter fw = null;
		try {
			fw = new FileWriter("baidu.txt");
			fw.write("�ٶ�ɱ��");
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