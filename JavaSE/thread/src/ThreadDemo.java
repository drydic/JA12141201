/*
 * main----------------------{}
 * Thread���߳��࣬�߳��Լ��������ڶ����߳����ʱ����Ҫʵ�֣����run����
 * һ���̳�Thread��������
 * 	1.�̳�
 * 	2.��дrun��������
 *  3.ʵ�����̶߳���
 *  4.�����̣߳�start
 */

class Monkey1 extends Thread{
	String name;

	public Monkey1(String name) {
		super();
		this.name = name;
	}
	
	public void fight(){
		for (int i = 1; i < 11; i++) {
			System.out.println(name+"��ܵ�"+i+"������콫��");
		}
	}
	public void  run() {
		fight();
	}
}
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey1 m1 = new Monkey1("��һ��С���");
		Monkey1 m2 = new Monkey1("�ڶ���С���");
		Monkey1 m3 = new Monkey1("������С���");
		
		m1.start();
		m2.start();
		m3.start();
	}

}