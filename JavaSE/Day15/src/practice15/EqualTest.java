package practice15;

public class EqualTest {

	public static void main(String[] args) {
		int it = 65;
		float f1 = 65.0f;
		System.out.println("65��65.0f�Ƿ���ȣ�" + (it==f1));
		char ch = 'A';
		System.out.println("65��'A'�Ƿ���ȣ�" + (it == ch));
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println("str1��str2�Ƿ���ȣ�" + (str1 == str2));
		System.out.println("str1�Ƿ�equals str2?" + (str1.equals(str2)));
		//System.out.println("hello" == new EqualTest());
	}

}