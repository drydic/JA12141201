//��ʾ�׳��쳣������
//�Զ����쳣�ࣺ����̳�exception�쳣��������=�׸��������ĵ�����
//ʵ���ˣ��ж��߼�����  ���쳣������ ����

class FuException extends RuntimeException{
	public FuException(){}

	public FuException(String message) {
		super(message);//
		// TODO Auto-generated constructor stub
	}
	
}


class Test {
	void run(int[] arr, int index) {
		//�ֶ��쳣
		if (arr == null) {
			//�쳣����new + ����
			throw new NullPointerException();
//			throw new NullPointerException("��ָ���쳣");
		}
		if (index < 0) {
			throw new FuException("�±�Ϊ��");
		} else if (index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index>=���鳤��" + arr.length);
		} else {

			System.out.println(arr[index]);
		}
		System.out.println(arr[index]);
	}
}

public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] array = null;

		
		//1.��main������ֱ�ӷǷ���������
		//arr[5] = 134;
		// array[0] = 123;
		
		
		//2.���ó�Ա�������ڳ�Ա�����зǷ���������
//		run(arr, 6);
		
		
		//3.������ĳ�Ա�����зǷ�����
		
		Test test = new Test();
		test.run(array, -2);

		System.out.println("==================");
	}
	public static void run(int[] arr, int index){
		System.out.println(arr[index]);
		System.out.println("==================");
	}
}