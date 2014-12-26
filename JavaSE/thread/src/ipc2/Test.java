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
package ipc2;

class Resource {
	int id;
	String name;
	boolean flag = false;// �Ƿ��в�Ʒ

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
			synchronized (r) {
				if (r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				switch (key++ % 3) {
				case 0:
					r.id = 6666;
					r.name = "iphone6";
					System.out.println("����iPhone6");
					break;
				case 1:
					r.id = 7777;
					r.name = "iphone7";
					System.out.println("����iPhone7");
					break;
				case 2:
					r.id = 8888;
					r.name = "iphone8";
					System.out.println("����iPhone8");
					break;

				default:
					break;
				}
				r.flag = true;
				r.notify();
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
			synchronized (r) {
				if (!r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("��name:" + r.name + "\tid:" + r.id);
				r.flag = false;
				r.notify();
			}
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
		//Thread t0 = new Thread(in);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//Thread t3 = new Thread(out);

		// �����߳�
		//t0.start();
		t1.start();
		t2.start();
		//t3.start();

	}

}