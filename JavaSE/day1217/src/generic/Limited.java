package generic;
class Father<T>{}
public class Limited {

	public static void test(Father<? super Number> father){
		System.out.println("This is test");
	}
	public static void  show(Father<? extends Number> father) {
		System.out.println("this is show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father<Integer> f1 = new Father<>();// Number 子类
		Father<Object> f2 = new Father<>();
		show(f1);
		test(f2);
		
//		test(f1);//实参只能是Number类或其父类
//		show(f2);//实参只能是Number类或其子类
	}

}
