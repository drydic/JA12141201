package file_demo;

import java.io.File;
import java.io.IOException;
/*
 * File:java.io. 与平台无关的，目录，文件
 * 		创建，删除，重命名...
 * File类：不能直接访问内容本身，--使用输入输出流来对内容操作
 */
public class FileDemo {

	
	public static void main(String[] args) throws IOException {
		//.当前路径 ..上一目录
		File file = new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());	//String
		System.out.println(file.getAbsoluteFile());	//File
		System.out.println(file.getAbsoluteFile().getParent());	//File
		System.out.println(file.getParent());	//File
		
		//创建文件
		File tmp = File.createTempFile("tem_file", ".txt");
		File tem1 = File.createTempFile("buf", ".txt",file);
		tmp.deleteOnExit();
		tem1.deleteOnExit();
		
		//创建文件
		File file2 = new File("create\\dir");
		//在同一目录：不能创建同名的文件、文件夹
		//System.out.println(file2.createNewFile());
		System.out.println(file2.mkdir());
		System.out.println("存在？=" + file2.exists());
		
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
	}

}
