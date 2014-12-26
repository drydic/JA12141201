/*
 * 多线程：线程任务系统
 * 线程任务不相同的多线程
 * 
 * 1、怎么去获得共享数据？	----一参构造函数
 * 2、怎么保证输入与输出线程同步？
 * 3、产量==销量？
 * 					任意
 * 共享数据----------》锁-----------》锁.方法-------------》
 * 
 */
package ipc3;

class Resource {
	int id;
	private String name;
	boolean flag = false;// 是否有产品

	// 同步方法：锁---this
	public synchronized void set(int id, String name) {
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			// 生产
			this.id = id;
			this.name = name;
			System.out.println("生产了一部：" + this.name + "\tid" + this.id);
			// 通知销售：
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
			System.out.println("卖name:" + this.name + "\tid:" + this.id);
			this.flag = false;
			this.notify();
		}
	}
}

// 产线
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

// 销售
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
		// 创建共享资源
		Resource r = new Resource();
		// 创建线程任务：run
		Input in = new Input(r);
		Output out = new Output(r);

		// 创建线程对象
		// Thread t0 = new Thread(in);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		// Thread t3 = new Thread(out);

		// 开启线程
		// t0.start();
		t1.start();
		t2.start();
		// t3.start();

	}

}
