package day12;

import java.util.Map;
import java.util.TreeMap;

public class MapCount {

	public static void main(String[] args)  {
		String s ="1391353517";
		char[] content =s.toCharArray();
		Map<Character, Integer> map =new TreeMap<Character,Integer>();
		for (int i = 0; i < content.length; i++){
			if (-1 != s.indexOf(content[i])){
				if (null != map.get(content[i])){
					map.put(content[i], map.get(content[i]) + 1);
				}else{
					map.put(content[i], 1);
				}
			}
		}
		System.out.println(map);
		int maxValue = map.get(content[0]);
		char str = ' ';
		for (int j = 0; j < content.length; j++)
			
			if (maxValue <= map.get(content[j]))
			{
				maxValue = map.get(content[j]);
				str = content[j];
			}
		System.out.println("现次数最多的字符：" + str + " 出现次数：" + maxValue);
	}

}