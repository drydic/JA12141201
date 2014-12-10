/**
建立一个用于操作数组的工具类，其中包含着常见的对数组操作的函数：最值 排序等。
@author 张三
@version V1.0
  */

class ArrayTool{

	private ArrayTool(){}//该类中的方法都是静态的，所以该类是不需要创建对象的。为了保证不让其他创建该类对象，可以将构造函数初始化
	/* *
	获取整型数组的最大值。
	*/
	public static int getMax(int[] arr){
		int maxIndex = 0;
		for(int i = 1; x<arr.length; x++){
			if(arr[x]>arr[maxIndex])
				maxIndex = x;
		}
		
		return arr[maxIndex];
	}
	/* *
	数组排序
	*/
	
	public static selectSort(int[] arr){
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++)
				swap(arr,x,y);
		}
	}
	
	//数组位置置换
	private static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/* 
	获取指定的元素在指定数组中的索引
	*/
	public static int getIndex(int[] arr,key){
		for(int x=0; x<arr.length; x++){
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	/* *
	将int数组转换成字符串。格式：[e1,e2,e3...]
	*/
	public static String arrayToString(int[] arr){
		String str = "[";
		
		for(int x=0; x<arr.length; x++){
			if(x!=arr.length-1)
				str  = str + arr[x] + ",";
			else
				str  = str + arr[x] + "]";
		}
		return str;
	}

}