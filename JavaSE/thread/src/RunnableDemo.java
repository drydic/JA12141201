
public class RunnableDemo implements Runnable {
	private int i;
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + "==" + i);
		}
	}
	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		//RunnableDemo rd1 = new RunnableDemo();
		
		Thread t1 = new Thread(rd);
		Thread t2 = new Thread(rd);
		t1.start();
		t2.start();
		for (int i = 0; i < 100; i++) {
			
		}
		
	}

}