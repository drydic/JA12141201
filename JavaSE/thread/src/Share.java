
public class Share implements Runnable {
	int ticket = 10;
	int num = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (ticket > 0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName() + "�����˵�" + num + "�ų�Ʊ����ʣ" + ticket + "�ų�Ʊ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Share t = new Share();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.setName("��һ����Ʊ����");
		t2.setName("�ڶ�����Ʊ����");
		t3.setName("��������Ʊ����");
		t1.start();
		t2.start();
		t3.start();
	}


}