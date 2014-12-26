package priority;
class Demo extends Thread{
	String name;

	public Demo(String name) {
		super();
		this.name = name;
	}
	public void run() {
		super.run();
		System.out.println(getName() + "...pri=" + getPriority());
	}
}
public class PriorityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo d1 = new Demo("线程0");
		Demo d2 = new Demo("线程1");
		Demo d3 = new Demo("线程2");

		d1.setPriority(Demo.MAX_PRIORITY);
		d3.setPriority(Demo.MIN_PRIORITY);
		
		d1.start();
		d2.start();
		d3.start();
	}

}
