package book;

public class DivTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("你输入的两个数相除的结果是：" + c);
		} catch (IndexOutOfBoundsException e1) {
			// TODO: handle exception
			System.out.println("数组越界：运行程序时输入的参数个数不够");
		} catch (NumberFormatException e3) {
			// TODO: handle exception
			System.out.println("数字格式异常：程序只能接受整数参数");
		} catch (ArithmeticException e4) {
			// TODO: handle exception
			System.out.println("算数异常");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("位置异常");
		}
	}

}
