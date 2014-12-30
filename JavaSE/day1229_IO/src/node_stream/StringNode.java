package node_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * �ڵ�������ײ��豸�ļ��������ͼ���
 * �����������ڽڵ������߼���
 */
public class StringNode {

	
	public static void main(String[] args) throws IOException {
		//ʹ���ڴ��е��ַ�����Ϊ����Դ
		String src = "aaaaaaaaaaaaaaaaaa"+
					 "bbbbbbbbbbbbbbbbbb"+
					 "cccccccccccccccccc"+
					 "dddddddddddddddddd";
		char[] buffer = new char[32];
		int hasRead = 0;
		StringReader sr = new StringReader(src);
		while ((hasRead = sr.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, hasRead));
		}
		
		//
		StringWriter sw = new StringWriter();
		sw.write("eeeeeeeeeeeeeeeeeeee");
		sw.write("ffffffffffffffffffff");
		sw.write("gggggggggggggggggggg");
		sw.write("zzzzzzzzzzzzzzzzzzzz");
		
		System.out.println(sw.toString());
		
		
		
		
	}

}