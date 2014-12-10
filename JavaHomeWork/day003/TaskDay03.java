public class TaskDay03{
	public static void main(String[] args){
		int[][] grade = new int[20][5];//存放学生成绩
		int[] sum = new int[20];	//存放每个学生的总分
		int[] total = new int[5];	//存放所有学生的某门课程的平局分
		for(int i = 0; i<20;i++){
			for(int j = 0;j<5; j++){
				grade[i][j] = (int)(Math.random()*100);
			}
		}
		
		/* 输出学生每门课的成绩 */
		System.out.println("\n		学生成绩表");
		System.out.println("\n	coreC++ coreJava  Servelt   JSP     EJB");
		for(int i = 0; i < 20; i++){
			System.out.print("学生"+(i+1)+":");
			for(int j = 0; j < 5; j++){
				System.out.print("	    " + grade[i][j]);
			}
			//System.out.print("	    " + sun[i]);
			System.out.println();
		}
		/* 每个学员的总分 */
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 5; j++){
				sum[i] += grade[i][j];
			}
			System.out.println("学生" + (i+1) + "的总分是：" + sum[i]);
		}
		
		/* 所有学员某门课程的平均分 */
		System.out.println("\n		所有学员某门课程的平均分");
		System.out.println("\n	coreC++ coreJava  Servelt   JSP     EJB");
		for(int j = 0; j < 5; j++){
			for(int i = 0; i < 20; i++){
				total[j] += grade[i][j];
			}
			System.out.print("	    " + total[j]/20);
		}
	}
}