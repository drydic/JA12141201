public class Test{
	public static void main(String[] args){
		Army a = new Army(3);
		
		Tank W1 = new Tank();
		WarShip W2 = new WarShip();
		Flighter W3 = new Flighter();
		Flighter W4 = new Flighter();
		
		a.addWeapon(W1);
		a.addWeapon(W2);
		a.addWeapon(W3);
		//a.addWeapon(W4);//不加入武器库刚好达到最大，加入超出武器库最大值
		
		a.attackAll();
		a.moveAll();
	}
}