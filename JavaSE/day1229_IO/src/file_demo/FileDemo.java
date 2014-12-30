package file_demo;

import java.io.File;
import java.io.IOException;
/*
 * File:java.io. ��ƽ̨�޹صģ�Ŀ¼���ļ�
 * 		������ɾ����������...
 * File�ࣺ����ֱ�ӷ������ݱ�����--ʹ������������������ݲ���
 */
public class FileDemo {

	
	public static void main(String[] args) throws IOException {
		//.��ǰ·�� ..��һĿ¼
		File file = new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());	//String
		System.out.println(file.getAbsoluteFile());	//File
		System.out.println(file.getAbsoluteFile().getParent());	//File
		System.out.println(file.getParent());	//File
		
		//�����ļ�
		File tmp = File.createTempFile("tem_file", ".txt");
		File tem1 = File.createTempFile("buf", ".txt",file);
		tmp.deleteOnExit();
		tem1.deleteOnExit();
		
		//�����ļ�
		File file2 = new File("create\\dir");
		//��ͬһĿ¼�����ܴ���ͬ�����ļ����ļ���
		//System.out.println(file2.createNewFile());
		System.out.println(file2.mkdir());
		System.out.println("���ڣ�=" + file2.exists());
		
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
	}

}