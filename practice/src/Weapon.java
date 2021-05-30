
public abstract class Weapon {
	protected String wName;
	protected int atk;
	protected int price;
	
	public Weapon() {
		
	}
	
	public String getwName() {
		return wName;
	}
	public abstract boolean setwName(String wName);
	
	public int getAtk() {
		return atk;
	}
	public abstract boolean setAtk(int atk);
	
	public int getPrice() {
		return price;
	}
	public abstract boolean setPrice(int price);
	
	public abstract void display(int index);
	
}
