public class TransterTest{
	public static void swap(int a,int b){
		//下面三行代码实现a b 变量的值交换
		//定义一个临时变量来保存a变量的值
		int tmp = a;
		a=b;
		b=tmp;
		System.out.println("a= " + a + ":b=" + b);
	}
	public static void main(String[] args){
		int a=6;
		int b=9;
		swap(a,b);
		System.out.println("a=" + a + ":b=" + b);
	}
}