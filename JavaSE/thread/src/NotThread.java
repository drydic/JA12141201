
class Monkey extends Thread{
	String name;

	public Monkey(String name) {
		super();
		this.name = name;
	}
	
	public void fight(){
		for (int i = 1; i < 11; i++) {
			System.out.println(name+"��ܵ�"+i+"������콫��");
		}
	}
}
public class NotThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m1 = new Monkey("��һ��С���");
		Monkey m2 = new Monkey("�ڶ���С���");
		Monkey m3 = new Monkey("������С���");
		
		m1.fight();
		m2.fight();
		m3.fight();
	}

}