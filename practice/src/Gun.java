
public class Gun extends Weapon {
	private int ammoLevel;
	private int ammoCap;
	
	
	public int getAmmoLevel() {
		return ammoLevel;
	}


	public boolean setAmmoLevel(int ammoLevel) {
		if (ammoLevel<1 || ammoLevel >3) {
			return false;
		}else {
			this.ammoLevel=ammoLevel;
			return true;	
		}
		
	}
	
	

	public int getAmmoCap() {
		return ammoCap;
	}


	public boolean setAmmoCap(int ammoCap) {
		if(ammoCap %2 == 0) {
			this.ammoCap = ammoCap;
			return true;
		}else {
			return false;
		}
	}
	
	


	public Gun() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean setwName(String wName) {
		if(wName.endsWith("-G")) {
			this.wName = wName;
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean setAtk(int atk) {
		// TODO Auto-generated method stub
		if (atk <20 || atk >450) {
			
			return false;
		}else {
			this.atk = atk;
			return true;
		}		
	}
	

	@Override
	public boolean setPrice(int price) {
		if (price <1500 || price >10000) {
			return false;
		}else {
			this.price = price;
			return true;
		}	
	}


	@Override
	public void display(int index) {
		System.out.println("No: " + (index+1));
		System.out.println("weapon name: " + this.wName);
		System.out.println("weapon atk:  "  + this.atk);
		System.out.println("price: "+ this.price);
		System.out.println("ammo cap:  " + this.ammoCap);
		System.out.println("ammo level:  " + this.ammoLevel);
		System.out.println(" ");
	}

}
