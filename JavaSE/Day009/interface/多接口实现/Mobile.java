//����ʵ����===ʵ�ֽӿ�
public class Mobile implements USB,Wifi{
	private int  num;
	private String brand;
	
	//���캯��
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num = num;
		this.brand = brand;
	}
	//get() set()
	//info
	public void info(){
		System.out.println("Ʒ�ƣ�" + brand);
		System.out.println("���룺" + num);
	}
	
	public void call(){
		System.out.println("��绰");
	}
	
	public void sms(){
		System.out.println("������");
	}
	
	//ʵ��������ʵ�ֽӿڡ����С��ĳ��󷽷�
	//usb
	public void read(){
		System.out.println("read USB");
	}
	
	public void write(){
		System.out.println("write USB");
	}
	
	//wifi
	public void open(){
		System.out.println("Open Wifi");
	}
	
	public void close(){
		System.out.println("close wifi");
	}

}