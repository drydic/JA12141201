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
//			System.out.println("运行时异常");
//		}
		
		 catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("空指针异常");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("未知异常");
		}
	}

}
