package bean;

import java.util.Comparator;
/*
 * ��String �ĳ������� �ٰ��ֵ�����
 */
public class ComparatorByLength implements Comparator<String> {

	
	
		
		

		@Override
		public int compare(String s1, String s2) {
			
			return s1.length()-s2.length();
			
//			return -(res ==0 ? s1.compareTo(s2) : res);
		}
		
		
		 
	}

