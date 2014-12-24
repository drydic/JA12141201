package set;

import java.util.HashSet;

class A{
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
class B{
	@Override
	public int hashCode() {
		return 1;
	}
}
class C{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
}
}


/*
 * �����д���equals������ҲӦ�ø�дhashcode����
 */
public  class HashSetTest {

	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		/*
		 *��дequals����������true������£����� hashcode��һ����
		 *��ˣ�hashset��Ȼ������������
		 */
		System.out.println(hs.add(new A()));
		System.out.println(hs.add(new A()));
		
		/*
		 * ���������hashcode��ͬ�����ǣ�equals��������false��
		 * ��ˣ�hashset����������ͬ��Ԫ��
		 */
		System.out.println(hs.add(new B()));
		System.out.println(hs.add(new B()));
		
		/*
		 *��equals����true��hashcode������ͬ��ֵ��
		 *hashset������Ϊ��ͬһԪ��
		 */
		System.out.println(hs.add(new C()));
		System.out.println(hs.add(new C()));
		hs.add(null);
		
		
		System.out.println(hs);
	}

}