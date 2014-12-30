package node_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * 节点流：与底层设备文件关联、低级流
 * 处理流：基于节点流、高级流
 */
public class StringNode {

	
	public static void main(String[] args) throws IOException {
		//使用内存中的字符串作为数据源
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
