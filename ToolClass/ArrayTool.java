/**
����һ�����ڲ�������Ĺ����࣬���а����ų����Ķ���������ĺ�������ֵ ����ȡ�
@author ����
@version V1.0
  */

class ArrayTool{

	private ArrayTool(){}//�����еķ������Ǿ�̬�ģ����Ը����ǲ���Ҫ��������ġ�Ϊ�˱�֤������������������󣬿��Խ����캯����ʼ��
	/* *
	��ȡ������������ֵ��
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
	��������
	*/
	
	public static selectSort(int[] arr){
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++)
				swap(arr,x,y);
		}
	}
	
	//����λ���û�
	private static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/* 
	��ȡָ����Ԫ����ָ�������е�����
	*/
	public static int getIndex(int[] arr,key){
		for(int x=0; x<arr.length; x++){
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	/* *
	��int����ת�����ַ�������ʽ��[e1,e2,e3...]
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