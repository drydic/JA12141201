import java.util.*;
public class Home2{
	public static void main(String args[]){
		System.out.println("***********************************");
		System.out.println("|     1.add one student           |");
		System.out.println("|     2.show all students         |");
		System.out.println("|     3.exit program              |");
		System.out.println("|    please input select(1-3):    |");
		System.out.println("***********************************");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch(choice){
			case 1:
			System.out.println("add one student!");
			break;
			case 2:
			System.out.println("show all students!");
			break;
			default:
			break;
		}
		}
}