public class InstanceInitTest{
	int a = 9;
	{
		a = 6;
	}
	//int a = 9;
	public static void main(String[] args){
		System.out.println(new InstanceInitTest().a);
	}
}