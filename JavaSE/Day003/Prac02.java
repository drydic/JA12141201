//���101-200֮�������

public class Prac02{
	public static void main(String args[]){
		for (int i=101;i<200;i+=2){
			boolean f=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					f=false;
					break;
				}
			}
			if(f)
				System.out.println("�����ǣ�" + i);
		}
	}
}