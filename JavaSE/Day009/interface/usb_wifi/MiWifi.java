

public class MiWifi implements USB_WIFI{
	//�ص�
	String brand = "С��";
	
	//����
	//usb
	public void read(){
		System.out.println("��WIFI: to read.");
	}
	public void write(){
		System.out.println("��WIFI: to write.");
	}
	
	//wifi
	public void open(){
		System.out.println("��WIFI: to open.");
	}
	public void close(){
		System.out.println("��WIFI: to close.");
	}
	
	//usbToWifi
	
	public void usbToWifi(){
		System.out.println("usb ת wifi");
	}
	
}