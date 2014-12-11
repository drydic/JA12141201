public class StringTest{
	public static void main(String[] args){
		//获取字符串中指定位置的字符
		String s = new String("qwertyuiopasdfghjklzxcvbnm");
		
		System.out.println("s.charAt(5):" + s.charAt(5));
		System.out.println();
		
		//比较两个字符串的大小
		String s1 = new String("abcdefghijiklmn");
		String s2 = new String("aebdefghijiklmnopq");
		String s3 = new String("abcdefghijikl");
		
		System.out.println("s1.compareTo(s2):" + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3):" + s1.compareTo(s3));
		System.out.println();
		
		//返回该String对象是否以***结尾
		String s11 = new String("abcdefghijklmn");
		String s22 = new String("jklmn");
		
		System.out.println("s11.endsWith(s22):" + s11.endsWith(s22));
		
		//void getChars(int setBegin,int srcEnd,char[] dst,int dstBegin)
		char[] si = {'I',' ','l','o','v','e',' ','j','a','v','a'};
		String sa = new String("e45b");
		sa.getChars(0,3,si,7);
		System.out.println(si);
		System.out.println();
		
		//找出***子字符串在该字符串中从..开始第一次出现的位置
		String sq = new String("write once, run anywhere!");
		String sw = new String("run");
		System.out.println("sq.indexOf('r'):" + sq.indexOf('r'));
		System.out.println("sq.indexOf('r',2):" + sq.indexOf('r',2));
		System.out.println("sq.indexOf(sw):" + sq.indexOf(sw));
		System.out.println();
		
		//判断String对象从...位置算起，是否以**开始。
		String se = new String("write once, run anywhere!");
		String sr = new String("write");
		String st = new String("once");
		System.out.println("se.startsWith(sr):" + se.startsWith(sr));
		System.out.println("se.startsWith(st,6):" + se.startsWith(st,6));
		System.out.println();
		
		//将字符串转换成大、小写
		String sy = new String("java.lang.Class String");
		System.out.println("sy.toUpperCase():" + sy.toUpperCase());
		System.out.println("sy.toLowerCase():" + sy.toLowerCase());
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}