public class Test{
	public static void main(String[] args){
		//USB_KEY key = new USB_KEY();
		USB key = new USB_KEY();
		key.read();
		key.write();
		System.out.println("brand:" + USB_KEY.brand);
		
		//�̳е�����ת�� VS �ӿڡ�ʵ���������ת��
		Udisk u = new Udisk();
		//USB U = new Udisk();		
		u.read();
		u.write();
		System.out.println("brand:" + Udisk.brand);
	}
}