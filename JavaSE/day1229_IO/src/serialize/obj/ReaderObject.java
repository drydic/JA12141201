package serialize.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 反序列化：									节点流
 * 	1、ObjectIntputStream输入流对象：==处理流==基于FileInputStream
 * 	2、readObject（）--若知道具体类，需要强转
 */
public class ReaderObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//节点流
		FileInputStream fis = new FileInputStream("obj.txt");
		
		//处理流
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//IO:读取
		Person p2 = (Person)ois.readObject();
		
		System.out.println("name:" + p2.getName() + "\tage:" + p2.getAge());
		
		
		
		
		
		
	}
}
