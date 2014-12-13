//相同类型的变量、调用同一个方法时呈现出多种不同的行为特征叫做多态

class BaseClase{
	public int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
}

public class SubClass extends BaseClase{
	public String book = "轻量级Java EE企业应用实践";
	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
	public void sub(){
		System.out.println("子类的普通方法");
	}
	
	public static void main(String[] args){
		BaseClase bc = new BaseClase();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		
		BaseClase pbs = new SubClass();
		System.out.println(pbs.book);
		pbs.base();
		pbs.test();
		//pbs.sub();
		
		
	}
}