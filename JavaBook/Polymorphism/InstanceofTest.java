public class InstanceofTest{
	public static void main(String[] args){
		
		Object obj = "Hello";
		System.out.println("字符串是否是Object类的实例：" + (obj instanceof Object));
		
		System.out.println("字符串是否是String类的实例：" + (obj instanceof String));
		
		System.out.println("字符串是否是Math类的实例：" + (obj instanceof Math));
		
		System.out.println("字符串是否是Comparable接口的实例：" + (obj instanceof Comparable));
		
		// String a = "Hello";
		// System.out.println("字符串是否是Math类的实例：" + (a instanceof Nath));
	}
}