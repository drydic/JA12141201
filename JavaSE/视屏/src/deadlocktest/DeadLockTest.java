package deadlocktest;

class Test implements Runnable{
	private boolean flag;
	Test(boolean flag) {
		this.flag = flag;
	}
	@Override
	public void run() {
		if (flag) {
			while(true)
			synchronized (MyLock.locka) {
				System.out.println(Thread.currentThread().getName() + "..if  locka..");
				synchronized (MyLock.lockb) {
					System.out.println(Thread.currentThread().getName() + "..if  locakb..");
				}
			}
		}
		else {
			while(true)
			synchronized (MyLock.lockb) {
				System.out.println(Thread.currentThread().getName() + "..else    lockb..");
				synchronized (MyLock.locka) {
					System.out.println(Thread.currentThread().getName() + "..else  locka..");
				}
			}
		}
	}
	
}

class MyLock{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}
public class DeadLockTest {

	public static void main(String[] args) {
		Test a1 = new Test(true);
		Test a2 = new Test(false);
		
		Thread t2 = new Thread(a1);
		Thread t1 = new Thread(a2);
		t1.start();
		t2.start();
	}

}
