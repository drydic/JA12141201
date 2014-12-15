package weapon;

public class Army {
	Weapon[] w;
	int  index = 0;
	
	public Army(int num) {
		super();
		this.w = new Weapon[num];
	}
	public void addWeapon(Weapon wa){
		w[index++] = wa;
	}
	public void attactAll(){
		for(Weapon ww : w ){
			ww.attack();
		}
//		for (int i = 0; i < w.length; i++) {
//			w[i].attack();
//		}
	}
	public void moveAll(){
		for(Weapon ww:w){
			ww.move();
		}
//		for (int i = 0; i < w.length; i++) {
//			w[i].move();
//		}		
	}
}
