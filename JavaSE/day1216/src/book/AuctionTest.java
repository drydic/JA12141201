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
			throw new AuctionException("竞拍价必须是数值，不能包含其他字符");
		}
		if (initPrice > d) {
			throw new AuctionException("竞拍价比起拍价低，不允许竞拍");
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
