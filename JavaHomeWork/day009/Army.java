public class Army{
	Weapon[] w;
	int max;
	int j=0;
	Army(){}
	Army(int max){
		w = new Weapon[max];
		this.max = max;
	}
	public void addWeapon(Weapon wa){
		if(j<max){
			w[j]=wa;
			j++;
		}else{
			System.out.println("ÎäÆ÷¿âÒÑÂú£¡");
			return;
		}
	}
	public void attackAll(){
		for(int i = 0; i<w.length; i++){
			w[i].attack();
		}
	}
	public void moveAll(){
		for(int i = 0; i<w.length;i++){
			w[i].move();
		}
	}
	
}