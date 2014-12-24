
public class NotShare extends Thread {
	static int ticket = 10;
	int num = 0;
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (ticket > 0) {
				ticket--;
				num++;
				System.out.println(getName() + "卖出了第" + num + "张车票，还剩" + ticket + "张车票");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotShare o1 = new NotShare();
		NotShare o2 = new NotShare();
		NotShare o3 = new NotShare();
		
		o1.setName("第一个售票窗口");
		o2.setName("第二个售票窗口");
		o3.setName("第三个售票窗口");
		o1.start();
		o2.start();
		o3.start();
	}

}
