public class Test{
	public static void main(String[] args){
		//USB_KEY key = new USB_KEY();
		USB key = new USB_KEY();
		key.read();
		key.write();
		System.out.println("brand:" + USB_KEY.brand);
		
		//继承的向上转型 VS 接口、实现类的向上转型
		Udisk u = new Udisk();
		//USB U = new Udisk();		
		u.read();
		u.write();
		System.out.println("brand:" + Udisk.brand);
	}
}