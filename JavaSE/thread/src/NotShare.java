
public class NotShare extends Thread {
	static int ticket = 10;
	int num = 0;
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (ticket > 0) {
				ticket--;
				num++;
				System.out.println(getName() + "�����˵�" + num + "�ų�Ʊ����ʣ" + ticket + "�ų�Ʊ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotShare o1 = new NotShare();
		NotShare o2 = new NotShare();
		NotShare o3 = new NotShare();
		
		o1.setName("��һ����Ʊ����");
		o2.setName("�ڶ�����Ʊ����");
		o3.setName("��������Ʊ����");
		o1.start();
		o2.start();
		o3.start();
	}

}