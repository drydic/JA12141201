import java.util.*;
public class LotteryDrawing{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("How mang number do you need to draw?");
		int k = in.nextInt();
		
		System.out.print("what is the highest nember you can draw?");
		int n = in.nextInt();
		
		int[] number = new int[n];
		for (int i=0;i<number.length;i++)
			number[i] = i + 1;
		
		int[] result = new int[k];
		for (int i=0;i<number.length;i++){
			int r = (int)(Math.random()*n);
			result[i] = number[r];
			
			number[r] = number[n-1];
			n--;
			
		}
		Arrays.sort(result);
		System.out.println("Bet the following conbination.It'll make you rich!");
		for(int r: result)
			System.out.println(r);
	}
}