package _book;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

class R{
	int count;
	public R(int count){
		this.count = count;
	}
	public String toString(){
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if (obj!=null && obj.getClass() == R.class) {
			R r = (R)obj;
			if (r.count == this.count) {
				return true;
			}
		}
		return false;
	}
	public int hashCode(){
		return this.count;
	}
}

public class HashSetTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		R firstR = (R)it.next();
		firstR.count = -3;
		System.out.println(hs);
		hs.remove(new R(-3));
		System.out.println(hs);
		System.out.println("hs是否包含count为-3的R对象" + hs.contains(new R(-3)));
		System.out.println("hs时候包含count为5的R对象？" + hs.contains(new R(5)));
	}

}
