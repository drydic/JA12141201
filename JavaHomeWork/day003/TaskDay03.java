public class TaskDay03{
	public static void main(String[] args){
		int[][] grade = new int[20][5];//���ѧ���ɼ�
		int[] sum = new int[20];	//���ÿ��ѧ�����ܷ�
		int[] total = new int[5];	//�������ѧ����ĳ�ſγ̵�ƽ�ַ�
		for(int i = 0; i<20;i++){
			for(int j = 0;j<5; j++){
				grade[i][j] = (int)(Math.random()*100);
			}
		}
		
		/* ���ѧ��ÿ�ſεĳɼ� */
		System.out.println("\n		ѧ���ɼ���");
		System.out.println("\n	coreC++ coreJava  Servelt   JSP     EJB");
		for(int i = 0; i < 20; i++){
			System.out.print("ѧ��"+(i+1)+":");
			for(int j = 0; j < 5; j++){
				System.out.print("	    " + grade[i][j]);
			}
			//System.out.print("	    " + sun[i]);
			System.out.println();
		}
		/* ÿ��ѧԱ���ܷ� */
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 5; j++){
				sum[i] += grade[i][j];
			}
			System.out.println("ѧ��" + (i+1) + "���ܷ��ǣ�" + sum[i]);
		}
		
		/* ����ѧԱĳ�ſγ̵�ƽ���� */
		System.out.println("\n		����ѧԱĳ�ſγ̵�ƽ����");
		System.out.println("\n	coreC++ coreJava  Servelt   JSP     EJB");
		for(int j = 0; j < 5; j++){
			for(int i = 0; i < 20; i++){
				total[j] += grade[i][j];
			}
			System.out.print("	    " + total[j]/20);
		}
	}
}