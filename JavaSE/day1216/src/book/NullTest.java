package book;

import java.util.Date;


public class NullTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = null;
		try {
			System.out.println(d.after(new Date()));
		}
//			catch(RuntimeException e){
//			System.out.println("����ʱ�쳣");
//		}
		
		 catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("��ָ���쳣");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("δ֪�쳣");
		}
	}

}