
public class Sword extends Weapon {
	 private int sharp;
	 
	public int getSharp() {
		return sharp;
	}

	public boolean setSharp(int sharp) {
		if (sharp<1 || sharp>5) {
			return false;
		}else {
			this.sharp = sharp;
			return true;
		}
	}

	public Sword() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean setwName(String wName) {
		if(wName.endsWith("-S")) {
			this.wName = wName;
			return true;
		}else {
			return false;
		}

	}

	@Override
	public boolean setAtk(int atk) {
		if (atk <50 || atk >500) {
			return false;
		}else {
			this.atk = atk;
			return true;
		}	
	}

	@Override
	public boolean setPrice(int price) {
		// TODO Auto-generated method stub
		if (price <1500 || price >10000) {
			return false;
		}else {
			this.price = price;
			return true;
		}
	}

	@Override
	public void display(int index) {
		// TODO Auto-generated method stub
		System.out.println("No: " + (index+1));
		System.out.println("weapon name: " + this.wName);
		System.out.println("weapon atk:  "  + this.atk);
		System.out.println("price: "+ this.price);
		System.out.println("sharpness level: "+ this.sharp);
		System.out.println(" ");
	}

}
