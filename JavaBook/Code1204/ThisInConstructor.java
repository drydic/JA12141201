public class ThisInConstructor{
	//����һ����Ϊfoo��field
	public int foo;
	public ThisInConstructor(){
		//�ڹ������ﶨ��һ��foo����
		int foo = 0;
		//ʹ��this����˹��������г�ʼ���Ķ���
		//����Ĵ��뽫��Ѹմ��������foo field����Ϊ6
		this.foo = 6;
		
	}
	public static void main(String[] args){
		//����ʹ��thisinconstructor�����Ķ����foo field
		//����������Ϊ6������������뽫���6
		System.out.println(new ThisInConstructor().foo);
	}
}