public class InstanceofTest{
	public static void main(String[] args){
		Person p = new Person("Android",12);
		String str = new String("Hello");
		if(p instanceof Person){
			System.out.println("p ������");
		}else{
			System.out.println("P ��������");
		}
	}
}