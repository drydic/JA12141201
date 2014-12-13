public class ConversionTest{
	public static void main(String[] args){
		double d = 12.3;
		long l = (long)d;
		System.out.println(l);
		
		int in = 5;
		//boolean b = (boolean)in;
		Object obj = "Hello";
		String objstr = (String)obj;
		System.out.println(objstr);
		
		Object objpri = new Integer(5);
		if(objpri instanceof String){
			String str = (String)objpri;
			System.out.println(objpri);
		}
	}
}