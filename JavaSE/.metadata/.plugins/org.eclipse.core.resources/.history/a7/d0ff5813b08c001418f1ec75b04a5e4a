/*
 * 多线程：线程任务系统
 * 线程任务不相同的多线程
 * 
 * 1、怎么去获得共享数据？	----一参构造函数
 * 2、怎么保证输入与输出线程同步？
 * 3、产量==销量？
 */
package ipc;

class Resource {
	int id;
	String name;
	

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
			synchronized (r) {
				
				switch (key++ % 3) {
				case 0:
					r.id = 6666;
					r.name = "iphone6";
					System.out.println("生产iPhone6");
					break;
				case 1:
					r.id = 7777;
					r.name = "iphone7";
					System.out.println("生产iPhone7");
					break;
				case 2:
					r.id = 8888;
					r.name = "iphone8";
					System.out.println("生产iPhone8");
					break;

				default:
					break;
				}
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
			synchronized (r) {

				System.out.println("卖name:" + r.name + "\tid:" + r.id);
			}
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
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		// 开启线程
		t1.start();
		t2.start();

	}

}
