public class BooleanTest{
	public static void main(String args[]){
		boolean flag = false;//��true��or��false��
		//boolean flag = 0;//error
		if(!flag){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
		
		//ʹ��boolean���ַ����������ӣ�boolean���Զ�ת�����ַ���
		//""���ַ��� + 
		String str = true + "";
		System.out.println("str" + str);
	}
}