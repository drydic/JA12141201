/*
 * �쳣������
 * 1.runtime�쳣������Ա--�׳�   vs JVM--�Զ�����
 * 2.checked�쳣������Ա--�׳�  ����Ա---�ֶ�����
 * 
 * checked�쳣������
 * 1��throws
 * 2��try catch finally
 * ����Ա���ǣ�
*1��ʲôʱ��ᷢ���쳣��
*2����������ʲô�쳣��----runtime   checked
*3�������쳣�����������쳣��ô����
*    a��runtime    JVM		
*    b��checked��				when��					how								--ĳ���ϼ����--->����ִ��--->���
*    	|������throws ===��֪����ν���������			����ǩ����throws + checked�쳣����	--�׸������� --�����ߴ��� --�ϼ����������-->JVM
*    	|������try catch ===��֪����ô��������
*/
//�Զ���checked�쳣 ���̳�
class FuException extends Exception{
	public FuException(){}
	public FuException(String message){
		super(message);
	}
	public String toString(){
		String message = getLocalizedMessage();
		return "����Ա����" + message;
	}
}
/*�ж��쳣-------�׳�����-----�����쳣
 * runtime      ����              JVM
 * checked =========����Ա����============
 * ����
 * 
 * 
 * */
class Demo{
	public void run(int[] arr, int index) throws FuException,NullPointerException{
		if (arr==null) {
			throw new NullPointerException("JVM��ָ���쳣");
		}
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("JVM��index��������ĳ���");
		}else if (index < 0) {
			
			throw new FuException("����Ա������index����");
		}else{
			System.out.println(arr[index]);
		}
	}
}


public class DiyTest {
	public static void main(String[] args) {
		int[] array = new int[5];
		Demo demo = new Demo();
		try {//���ܷ����쳣�Ĵ������
			demo.run(array, 123);
			//demo.run(array, -12);
		} catch (FuException Fu) {
			// TODO Auto-generated catch block
			Fu.printStackTrace();
			System.out.println(Fu);
			System.out.println(Fu.toString());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		finally{//����ִ�еĲ���===������������������Դ�Ĳ������ļ�������  ���ݿ������  ��������ͻ�����Դ����
			System.out.println("finally");
		}
		System.out.println("=========end========");
	}
}