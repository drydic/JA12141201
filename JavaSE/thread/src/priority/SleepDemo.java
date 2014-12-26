package priority;

public class SleepDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("休眠5s开始");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("休眠5s结束");
	}

	public static void main(String[] args) {
		System.out.println("main开始");
		SleepDemo sd = new SleepDemo();
		sd.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("main结束");
	}

}
