package serialize.obj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 1.�����л�����
 * 2�����л���
 * 		a������ObjectOutputStream��������󣺴�����==���ڽڵ�
 * 		b��IO��writeObject()
 * 
 * ���ڴ桿����-->IO�������-->����-->IO������-->�ڴ�
 * 				���л�				�����л�
 */
public class WriteObject {

	public static void main(String[] args) {
		Person p = new Person(100, "Google");
		FileOutputStream fos;
		try {
			//�ڵ������ֽ���
			fos = new FileOutputStream("obj.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}