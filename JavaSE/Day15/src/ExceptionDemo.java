//演示抛出异常的流程
//自定义异常类：必须继承exception异常，可抛性=抛给调用他的调用者
//实现了：判断逻辑车辆  和异常处理的 分离

class FuException extends RuntimeException{
	public FuException(){}

	public FuException(String message) {
		super(message);//
		// TODO Auto-generated constructor stub
	}
	
}


class Test {
	void run(int[] arr, int index) {
		//手动异常
		if (arr == null) {
			//异常对象：new + 构造
			throw new NullPointerException();
//			throw new NullPointerException("空指针异常");
		}
		if (index < 0) {
			throw new FuException("下标为负");
		} else if (index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index>=数组长度" + arr.length);
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

		
		//1.在main函数中直接非法操作数组
		//arr[5] = 134;
		// array[0] = 123;
		
		
		//2.调用成员方法，在成员方法中非法操作数组
//		run(arr, 6);
		
		
		//3.其他类的成员方法中非法操作
		
		Test test = new Test();
		test.run(array, -2);

		System.out.println("==================");
	}
	public static void run(int[] arr, int index){
		System.out.println(arr[index]);
		System.out.println("==================");
	}
}
