public class StringTest{
	public static void main(String[] args){
		//��ȡ�ַ�����ָ��λ�õ��ַ�
		String s = new String("qwertyuiopasdfghjklzxcvbnm");
		
		System.out.println("s.charAt(5):" + s.charAt(5));
		System.out.println();
		
		//�Ƚ������ַ����Ĵ�С
		String s1 = new String("abcdefghijiklmn");
		String s2 = new String("aebdefghijiklmnopq");
		String s3 = new String("abcdefghijikl");
		
		System.out.println("s1.compareTo(s2):" + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3):" + s1.compareTo(s3));
		System.out.println();
		
		//���ظ�String�����Ƿ���***��β
		String s11 = new String("abcdefghijklmn");
		String s22 = new String("jklmn");
		
		System.out.println("s11.endsWith(s22):" + s11.endsWith(s22));
		
		//void getChars(int setBegin,int srcEnd,char[] dst,int dstBegin)
		char[] si = {'I',' ','l','o','v','e',' ','j','a','v','a'};
		String sa = new String("e45b");
		sa.getChars(0,3,si,7);
		System.out.println(si);
		System.out.println();
		
		//�ҳ�***���ַ����ڸ��ַ����д�..��ʼ��һ�γ��ֵ�λ��
		String sq = new String("write once, run anywhere!");
		String sw = new String("run");
		System.out.println("sq.indexOf('r'):" + sq.indexOf('r'));
		System.out.println("sq.indexOf('r',2):" + sq.indexOf('r',2));
		System.out.println("sq.indexOf(sw):" + sq.indexOf(sw));
		System.out.println();
		
		//�ж�String�����...λ�������Ƿ���**��ʼ��
		String se = new String("write once, run anywhere!");
		String sr = new String("write");
		String st = new String("once");
		System.out.println("se.startsWith(sr):" + se.startsWith(sr));
		System.out.println("se.startsWith(st,6):" + se.startsWith(st,6));
		System.out.println();
		
		//���ַ���ת���ɴ�Сд
		String sy = new String("java.lang.Class String");
		System.out.println("sy.toUpperCase():" + sy.toUpperCase());
		System.out.println("sy.toLowerCase():" + sy.toLowerCase());
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}