//������
abstract class USB{
	public abstract void read();
	public abstract void write();
}
//�ӿ�
interface Wifi{
	void open();
	void close();
}




public class Niming{
	public static void main(String[] args){
		//�����ڲ���==����ľֲ��ڲ���==����Ķ��󡢻���ʵ����Ķ���
		USB udisk = new USB(){
			public void read(){
				System.out.println("��ȡU��");
			}
			public void write(){
				System.out.println("дU��");
			}
		};
		udisk.read();
		udisk.write();
		
		//wifi
		Wifi w = new Wifi(){
			public void open(){
				System.out.println("��wifi");
			}
			public void close(){
				System.out.println("�ر�wifi");
			}
		};
		w.open();
		w.close();
	}
}