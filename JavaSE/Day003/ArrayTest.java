//���飺���ͬ���������͡������������͡������������͡���Ԫ�أ��±귶Χ��0��N-1��
//������ֻ�ܴ��һ������
//�����ص㣺1�������������ǿ��2�����ȹ̶� ��3���ƶ�����Ч�ʵ�
//
public class ArrayTest{
	public static void main(String args[]){
		//�������飺�����洢��ջ�ռ䣺�󲿷��ں����У��������ֲ��������β�
		
		int[] arr;		//����ʹ������
		int arr1[];		//����������ʹ��
		
		//int  test[10];//��������ʱ��������ָ����С
		
		//��ʼ��:�����ռ�+�ڶѿռ�洢 = �ڿռ��д洢
		arr = new int[10];		//��ʽĬ��ֵΪ��
		//arr1 = {1,2,3};			//��ʽ
		//arr1 = new int[]{1,2,3}
		
		
		//����+��ʼ��
		String[]  str = new String[5];//Ĭ�ϳ�ʼ������̬��ʼ��
		Object[]  obj = new Object[5];//ʵ��Ԫ������  ���������͵�����
		
		
		String[]  str1 = new String[]{"Java","C++","Android","C"};
		String[]  str2 = 			 {"Java","C++","Android","C"};//��д
		
		//�������飺����ֻ����һ�����
		System.out.println(
		(new String[]{"Apple","Google","Benz","Tesla"})[2]
		);
		//ʹ������
		System.out.println("str1[0] = " + str1[0]);
		
		//����������
		//for +���鳤��
		for(int i=0;i<str1.length;i++){
			System.out.print("str1:" + str1[i] + "\t");
		}
		System.out.println("");
		
		//for each:�������飬����
		for ( String ele :str1){
			System.out.print("str1:" + ele + "\t");
		}
		System.out.println("");
		
		//���鿽��
		String[] str1_copy = str1;
		for (String ele : str1_copy){
			System.out.print("str1_copy:" + ele + "\t");
		}
		
		System.out.println("");
		str1_copy[0] = "python";
		
		
	}
}