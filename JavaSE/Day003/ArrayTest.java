//数组：存放同种数据类型【基本数据类型、引用数据类型】的元素：下标范围【0，N-1】
//变量：只能存放一个数据
//数组特点：1、随机访问能力强。2、长度固定 。3、移动数据效率低
//
public class ArrayTest{
	public static void main(String args[]){
		//声明数组：变量存储在栈空间：大部分在函数中，变量：局部变量，形参
		
		int[] arr;		//建议使用这种
		int arr1[];		//不建议这样使用
		
		//int  test[10];//声明数组时，不可以指定大小
		
		//初始化:创建空间+在堆空间存储 = 在空间中存储
		arr = new int[10];		//显式默认值为零
		//arr1 = {1,2,3};			//隐式
		//arr1 = new int[]{1,2,3}
		
		
		//声明+初始化
		String[]  str = new String[5];//默认初始化：动态初始化
		Object[]  obj = new Object[5];//实际元素类型  是数组类型的子类
		
		
		String[]  str1 = new String[]{"Java","C++","Android","C"};
		String[]  str2 = 			 {"Java","C++","Android","C"};//简写
		
		//匿名数组：数组只是用一次情况
		System.out.println(
		(new String[]{"Apple","Google","Benz","Tesla"})[2]
		);
		//使用数组
		System.out.println("str1[0] = " + str1[0]);
		
		//完成数组遍历
		//for +数组长度
		for(int i=0;i<str1.length;i++){
			System.out.print("str1:" + str1[i] + "\t");
		}
		System.out.println("");
		
		//for each:遍历数组，集合
		for ( String ele :str1){
			System.out.print("str1:" + ele + "\t");
		}
		System.out.println("");
		
		//数组拷贝
		String[] str1_copy = str1;
		for (String ele : str1_copy){
			System.out.print("str1_copy:" + ele + "\t");
		}
		
		System.out.println("");
		str1_copy[0] = "python";
		
		
	}
}