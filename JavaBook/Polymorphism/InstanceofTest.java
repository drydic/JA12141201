public class InstanceofTest{
	public static void main(String[] args){
		
		Object obj = "Hello";
		System.out.println("�ַ����Ƿ���Object���ʵ����" + (obj instanceof Object));
		
		System.out.println("�ַ����Ƿ���String���ʵ����" + (obj instanceof String));
		
		System.out.println("�ַ����Ƿ���Math���ʵ����" + (obj instanceof Math));
		
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����" + (obj instanceof Comparable));
		
		// String a = "Hello";
		// System.out.println("�ַ����Ƿ���Math���ʵ����" + (a instanceof Nath));
	}
}