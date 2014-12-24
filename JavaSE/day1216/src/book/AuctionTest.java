package book;
class AuctionException extends Exception{

	public AuctionException() {
		
		
	}

	public AuctionException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
}
public class AuctionTest {

	/**
	 * @param args
	 */
	public double initPrice = 3.0;
	public void bid(String bidprice)
	      throws AuctionException
	{
		double d = 0.0;
		try {
			d = Double.parseDouble(bidprice);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new AuctionException("���ļ۱�������ֵ�����ܰ��������ַ�");
		}
		if (initPrice > d) {
			throw new AuctionException("���ļ۱����ļ۵ͣ�����������");
		}
		initPrice = d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuctionTest at = new AuctionTest();
		try {
			at.bid("df");
		} catch (AuctionException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}