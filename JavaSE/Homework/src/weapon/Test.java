package weapon;

public class Test {
	
	public static void main(String[] args) {
		Army a = new Army(9);
		Tank tank = new Tank();
		Flighter f = new Flighter();
		WarShip w = new WarShip();
		Tank tank1 = new Tank();
		Flighter f1 = new Flighter();
		WarShip w1 = new WarShip();
		Tank tank2 = new Tank();
		Flighter f2 = new Flighter();
		WarShip w2 = new WarShip();
		
		a.addWeapon(tank);
		a.addWeapon(f);
		a.addWeapon(w);
		a.addWeapon(tank1);
		a.addWeapon(f1);
		a.addWeapon(w1);
		a.addWeapon(tank2);
		a.addWeapon(f2);
		a.addWeapon(w2);
		
		a.moveAll();
		a.attactAll();
	}

}