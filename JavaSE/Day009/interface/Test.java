public class Test{
	public static void main(String[] args){
		Mobile T2 = new Mobile(1234,"����2.0");
		
		T2.info();
		
		T2.call();
		T2.sms();
		
		//wifi
		T2.open();
		T2.close();
		
		//�ӿ��� ֱ�ӷ��� ����
		System.out.println("wifi:" + Wifi.ssid + "\t����:" + T2.pass);
		//System.out.println("Ʒ�ƣ�" + brand);
		//usb
		T2.read();
		T2.write();
		System.out.println("USB��׼��" + T2.version);
		
	}
}