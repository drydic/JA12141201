package process_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;

/*
 * �������������˵ײ������豸�Ͻڵ����Ĳ��졢���ṩ���ӷ���������������
 * ���裺
 * 	1���ṩһ���ڵ���
 * 	2����װ�ɴ�����
 * 	3��ֱ��ʹ�ô�������IO��������ӵĲ����ײ���豸�ļ�
 * 	4���ر���Դ
 * 
 * ʹ��PrintStream��װOutputStream���ֽ���=�ڵ���
 */
public class PrintStreamTest {

	public static void main(String[] args) throws IOException {
		//�����ڵ���
		FileOutputStream fos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream("process_stream.txt");
			//��װ������
			ps = new PrintStream(fos);
			//3��IO
			ps.println("������");
			
			ps.println(new PrintStreamTest());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fos.close();
			ps.close();
		}
		
	}

}
