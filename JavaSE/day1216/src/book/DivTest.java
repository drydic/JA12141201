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
			System.out.println("�����������������Ľ���ǣ�" + c);
		} catch (IndexOutOfBoundsException e1) {
			// TODO: handle exception
			System.out.println("����Խ�磺���г���ʱ����Ĳ�����������");
		} catch (NumberFormatException e3) {
			// TODO: handle exception
			System.out.println("���ָ�ʽ�쳣������ֻ�ܽ�����������");
		} catch (ArithmeticException e4) {
			// TODO: handle exception
			System.out.println("�����쳣");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("λ���쳣");
		}
	}

}