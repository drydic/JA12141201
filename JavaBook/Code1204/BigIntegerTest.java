import java.math.*;
import java.util.*;

public class BigIntegerTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many number do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();
		
		BigInteger lotterOdds = BigInteger.valueOf(1);
		//System.odd.println(lotterOdds);
		for (int i=1;i<=k;i++)
			lotterOdds = lotterOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
			System.out.println("Your odd are 1 in " + lotterOdds + ".Good luck!");
	}
}