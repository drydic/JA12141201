//接口的多重实现
public class USB_KEY implements USB{
	//特点
	static final String brand = "Cherry";
	
	//义务
	public void read(){
		System.out.println("读键盘");
	}
	public void write(){
		System.out.println("读键盘");
	}
	
}
