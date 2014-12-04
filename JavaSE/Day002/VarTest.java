/*怎么定义类:
	1.Java源文件中只能有一个public class：
	2.类名==文件名
	3.标示符约定：驼峰命名规则
	4.类的组成：
		宏观上：成员变量，成员方法
		微观上：【类变量，类方法】【实例变量，实例方法】【静态代码块，构造方法】
*/
public class VarTest{
	//成员变量:num 、name 
		int num;
		String name;
	//成员方法
	void setName(int num){//局部变量：形参num、age、adress
		this.num = num;
		int age;
		String adress;
	}
	int getName(void){
		return this.num;
	}
} 