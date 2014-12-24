package resource;
//资源
class Resource1{
	String name;
	String sex;
	boolean flag = false;
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
			synchronized (r) {
				if (r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						
					}
				if (x==0) {
					r.name = "mike";
					r.sex = "nan";
				}
				else {
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
				r.flag = true;
				r.notify();
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
			synchronized (r) {
				if (!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						
					}
				System.out.println(r.name+"........."+r.sex);
				r.flag = false;
				r.notify();
			}
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