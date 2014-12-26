/*
 * ���̣߳��߳�����ϵͳ
 * �߳�������ͬ�Ķ��߳�
 * 
 * 1����ôȥ��ù������ݣ�	----һ�ι��캯��
 * 2����ô��֤����������߳�ͬ����
 * 3������==������
 * 					����
 * ��������----------����-----------����.����-------------��
 * 
 */
package ipc3;

class Resource {
	int id;
	private String name;
	boolean flag = false;// �Ƿ��в�Ʒ

	// ͬ����������---this
	public synchronized void set(int id, String name) {
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			// ����
			this.id = id;
			this.name = name;
			System.out.println("������һ����" + this.name + "\tid" + this.id);
			// ֪ͨ���ۣ�
			this.flag = true;
			this.notify();
		}
	}

	public synchronized void sale() {
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��name:" + this.name + "\tid:" + this.id);
			this.flag = false;
			this.notify();
		}
	}
}

// ����
class Input implements Runnable {
	Resource r;

	public Input(Resource r) {
		super();
		this.r = r;
	}

	int key = 0;

	public void run() {
		while (true) {

			switch (key++ % 3) {
			case 0:
				r.set(6666, "iphone6");

				break;
			case 1:
				r.set(7777, "iphone7");
				break;
			case 2:
				r.set(8888, "iphone8");
				break;

			default:
				break;
			}
		}
	}
}

// ����
class Output implements Runnable {
	Resource r;

	public Output(Resource r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.sale();
		}
	}
}

public class Test {

	public static void main(String[] args) {
		// ����������Դ
		Resource r = new Resource();
		// �����߳�����run
		Input in = new Input(r);
		Output out = new Output(r);

		// �����̶߳���
		// Thread t0 = new Thread(in);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// Thread t3 = new Thread(out);

		// �����߳�
		// t0.start();
		t1.start();
		t2.start();
		// t3.start();

	}

}