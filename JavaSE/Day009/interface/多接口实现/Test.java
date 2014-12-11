public class Test{
	public static void main(String[] args){
		Mobile T2 = new Mobile(1234,"锤子2.0");
		
		T2.info();
		
		T2.call();
		T2.sms();
		
		//wifi
		T2.open();
		T2.close();
		
		//接口名 直接访问 常量
		System.out.println("wifi:" + Wifi.ssid + "\t密码:" + T2.pass);
		//System.out.println("品牌：" + brand);
		//usb
		T2.read();
		T2.write();
		System.out.println("USB标准：" + T2.version);
		
	}
}