package priority;

public class YiedDemo extends Thread{

	
	public YiedDemo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+"---" + i);
			if (i==25) {
				Thread.yield();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YiedDemo yd = new YiedDemo("线程零");
		YiedDemo yd1 = new YiedDemo("线程一");
		yd.setPriority(MAX_PRIORITY);
		yd.start();
		yd1.start();
	}

}
