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
 * 如果复写类的equals方法，也应该复写hashcode方法
 */
public  class HashSetTest {

	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		/*
		 *复写equals方法，返回true的情况下，由于 hashcode不一样，
		 *因此：hashset依然当做两个对象
		 */
		System.out.println(hs.add(new A()));
		System.out.println(hs.add(new A()));
		
		/*
		 * 两个对象的hashcode相同，但是，equals方法返回false：
		 * 因此：hashset添加两个不同的元素
		 */
		System.out.println(hs.add(new B()));
		System.out.println(hs.add(new B()));
		
		/*
		 *当equals返回true、hashcode返回相同的值；
		 *hashset集合认为是同一元素
		 */
		System.out.println(hs.add(new C()));
		System.out.println(hs.add(new C()));
		hs.add(null);
		
		
		System.out.println(hs);
	}

}
