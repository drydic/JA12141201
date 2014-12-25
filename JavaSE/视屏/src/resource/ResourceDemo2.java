package resource;
//资源
class Resource1{
	private String name;
	String sex;
	boolean flag = false;
	public synchronized void set(String name,String sex) {
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			this.name = name;
			this.sex = sex;
			flag = true;
			this.notify();
		}
	}
	public synchronized void out() {
		if (!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name+"...."+sex);
		}
		flag = false;
		notify();
	}
}
//输入
class Input1 implements Runnable{
	Resource1 r;

	public Input1(Resource1 r) {
		this.r = r;
	}
	public void  run() {
		int x = 0;
		while (true) {
			if (x==0) {
				r.set("maik", "nan");
			}else {
				r.set("丽丽", "女女女女女女女女");
			}
			x = (x+1)%2;
		}
	}
	
}
//输出
class Output1 implements Runnable{
	Resource1 r;

	public Output1(Resource1 r) {
		
		this.r = r;
	}
	public void run() {
		while (true) {
			r.out();
		}
	}
}

public class ResourceDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建资源
		Resource1 r = new Resource1();
		//创建任务
		Input1 in = new Input1(r);
		Output1 out = new Output1(r);
		//创建线程，执行路径
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//开启线程
		t1.start();
		t2.start();
	}

}