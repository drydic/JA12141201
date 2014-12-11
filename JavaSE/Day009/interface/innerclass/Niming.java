//抽象类
abstract class USB{
	public abstract void read();
	public abstract void write();
}
//接口
interface Wifi{
	void open();
	void close();
}




public class Niming{
	public static void main(String[] args){
		//匿名内部类==特殊的局部内部类==子类的对象、或者实现类的对象
		USB udisk = new USB(){
			public void read(){
				System.out.println("读取U盘");
			}
			public void write(){
				System.out.println("写U盘");
			}
		};
		udisk.read();
		udisk.write();
		
		//wifi
		Wifi w = new Wifi(){
			public void open(){
				System.out.println("打开wifi");
			}
			public void close(){
				System.out.println("关闭wifi");
			}
		};
		w.open();
		w.close();
	}
}