//输出100以内能被三整除的前五个数

public class Prac01{
	public static void main(String args[]){
		int account=1,i=1;
		/*for(int i=1;i<=100 && account<=5;i++){
			if(i%3==0 ){
				System.out.println("i=" + i);
				account++;
			}
		}*/
		while(i<100 && account<=5){
			if(i%3==0){
				System.out.println("i=" + i);
				account++;
			}
			i++;
		}
	}
}