import java.util.*;
import java.io.*;
public class SystemTest{
	public static void main(String[] args) 
		throws Exception{
			Map<String,String> env = System.getenv();
			for (String name:env.keySet()){
				System.out.println(name + "--->" + env.get(name));
			}
			System.out.println(System.getenv("JAVA_HOME"));
			Properties props = System.getProperties();
			props.store(new FileOutputStream("props.txt"),"System Properties");
		}
}