public class Test{
	public static void main(String[] args){
		//MiWifi mi = new MiWifi();
		
		USB_WIFI mi = new MiWifi();
		//MiWifi mi2 = (MiWifi)mi;
		
		mi.open();
		mi.close();
		mi.read();
		mi.write();
		mi.usbToWifi();
		System.out.println("brand:" + ((MiWifi)mi).brand);
	}
}