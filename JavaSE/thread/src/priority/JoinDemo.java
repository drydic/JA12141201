package priority;



public class JoinDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "开启");
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main" +i);
			if (i==38) {
				JoinDemo j = new JoinDemo();
				j.start();
				//主线程调用了j的Join方法，主线程等待j线程的结束，才继续执行
				//假如当前线程，调用了另外一线程的Join方法，该线程等待
				j.join();
			}
		}
		
		
		System.out.println(Thread.currentThread().getName() + "结束");
	}

}