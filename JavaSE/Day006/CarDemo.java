/* 
	���ԣ�
		��̥��
		��ɫ
	��Ϊ��
		����
 */
 class Car{
	int num;
	String color;
	
	void run(){
		System.out.println(num +"......" +color);
	}
 }
 class CarDemo{
	public static void main(String[] args){
		Car c = new Car();
		c.num = 5;
		c.color = "red";
		
		c.run();
	}
 
 }