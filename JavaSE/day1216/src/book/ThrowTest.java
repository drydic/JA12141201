package book;

public class ThrowTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwChecked(3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		throwRuntime(-3);
	}
	public static void throwChecked(int a) throws Exception
	{
		if (a > 0) {
			throw new Exception("a的值大于0，不符合要求");
		}
	}
	public static void throwRuntime(int a){
		if (a > 0) {
			throw new RuntimeException("a的值大于0，不符合要求");
		}
	}

}
