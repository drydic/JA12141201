package serialize.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * �����л���									�ڵ���
 * 	1��ObjectIntputStream����������==������==����FileInputStream
 * 	2��readObject����--��֪�������࣬��Ҫǿת
 */
public class ReaderObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//�ڵ���
		FileInputStream fis = new FileInputStream("obj.txt");
		
		//������
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//IO:��ȡ
		Person p2 = (Person)ois.readObject();
		
		System.out.println("name:" + p2.getName() + "\tage:" + p2.getAge());
		
		
		
		
		
		
	}
}