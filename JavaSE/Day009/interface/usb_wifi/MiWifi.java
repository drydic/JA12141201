

public class MiWifi implements USB_WIFI{
	//特点
	String brand = "小米";
	
	//义务
	//usb
	public void read(){
		System.out.println("米WIFI: to read.");
	}
	public void write(){
		System.out.println("米WIFI: to write.");
	}
	
	//wifi
	public void open(){
		System.out.println("米WIFI: to open.");
	}
	public void close(){
		System.out.println("米WIFI: to close.");
	}
	
	//usbToWifi
	
	public void usbToWifi(){
		System.out.println("usb 转 wifi");
	}
	
}