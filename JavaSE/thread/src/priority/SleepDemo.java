package priority;

public class SleepDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("����5s��ʼ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����5s����");
	}

	public static void main(String[] args) {
		System.out.println("main��ʼ");
		SleepDemo sd = new SleepDemo();
		sd.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("main����");
	}

}