public class Sub extends Base{
	String str;
	void sub_show(){
		System.out.println("子类特有的方法");
	}
	void sub_show1(){
		System.out.println("子类特有方法2");
	}
	public static void main(String[] args){
		//Sub sub = new Sub();
		Base a1 = new Sub();//向上转型
		a1.base_show();
		/* if (b instanceof sub)
			 */
			 
		Sub b1 = (Sub)a1;
		b1.base_show();
		b1.sub_show();
		b1.sub_show1();
		//System.out.println("子类调用父类属性a：" + sub.a);
		//向下转型后可以访问父类的属性
		Base a2 = new Base();
		if (a2 instanceof Sub){
		Sub b2 = (Sub)a2;
		b2.base_show();
		b2.sub_show();
		b2.sub_show1();
		}
		/* b.show();//可以访问被子类复写的方法
		
		sub.base_show();//可以访问父类特有的方法
		
		sub.sub_show();//可以访问子类特有的方法 */
	
	
	
	
	
	
	
	
	
		/* //向上转型：默认，基类引用 指向 子类对象
		Base base = new Sub();
		base.show();//子类不能调用
		
		//System.out.println(base.str);//基类的引用不可以访问子类新增的成员【属性和方法】
		System.out.println(base.a);
		base.base_show();
		base.show();
		
		
		//向下转型：子类的引用指向父类的对象
		Base ba = new Sub();
		Sub sub = (Sub)ba;//强制类型转换
		
		//访问父类的属性
		System.out.println(sub.a);
		sub.base_show();
		
		//子类复写父类的方法
		sub.show();
		
		//访问子类的属性
		System.out.println(sub.str); */
		
		
		
		
		
	}
}