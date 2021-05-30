import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	Vector<Gun> VGun = new Vector<Gun>();
	Vector<Sword> VSword = new Vector<Sword>();
	
	private void addWeapon() {
		cls();
		String w = "";
		do {
			System.out.println("choose weapon type Gun / Sword: ");
			try {
				w = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println("Gun/Sword");
			}
		} while (!w.equals("Gun")&& !w.equals("Sword") );
		
		if (w.equals("Gun")) {
			Gun gun = new Gun();
			String name= "";
			do {
				System.out.println("weapon name must end -G:");
				try {
					name = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (gun.setwName(name)!= true);
			
			int att = 0;
			do {
				System.out.println("enter damage 20 - 450: ");
				try {
					att = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} while (gun.setAtk(att)!=true);
			
			int price = 0;
			do {
				System.out.println("enter price 1500 - 10000: ");
				try {
					price = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (gun.setPrice(price)!=true);
			
			int ammoCap = 0;
			do {
				System.out.println("enter ammo cap must be multiple of 2: ");
				try {
					ammoCap = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (gun.setAmmoCap(ammoCap)==false);
			
			int ammoL = 0;
			do {
				System.out.println("enter your ammoLevel: ");
				try {
					ammoL = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (gun.setAmmoLevel(ammoL)!=true);
			
			VGun.add(gun);
		}else if(w.equals("Sword")) {
			Sword sw = new Sword();
			String name = "";
			do {
				System.out.println("sword name end with -S: ");
				try {
					name = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (sw.setwName(name)!=true);
			
			int att = 0;
			do {
				System.out.println("input attack 50 - 500: ");
				try {
					att = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (sw.setAtk(att)!=true);
			
			int price = 0;
			do {
				System.out.println("input price 1500 - 10000: ");
				try {
					price = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (sw.setPrice(price)!=true);
			
			int shar = 0;
			do {
				System.out.println("sharpness 1-5: ");
				try {
					shar =sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (sw.setSharp(shar)!=true);
			
			VSword.add(sw);
		}
		cls();
		System.out.println("Success adding new Weapon");
		System.out.println("Press Enter to Continue");
		sc.nextLine();
		return;
	}
	
	private void cls() {
		for (int i = 0; i < 30; i++) {
			System.out.println(" ");
		}
	}
	
	private void view(int visibility) {
		int index = 0;
		cls();
		if(VGun.size() != 0) {
			for (int i = 0; i <VGun.size(); i++) {
				VGun.get(i).display(index);
				index+=1;
			}
		}
		if(VSword.size() != 0) {
			for (int j = 0; j <VSword.size(); j++) {
				VSword.get(j).display(index);
				index+=1;
			}
		}
		System.out.println(" ");
		if (visibility == 0) {
			System.out.println("Press Enter to Continue");
			sc.nextLine();			
		}
	}
	
	private void update() {
		view(1);
		int range = VGun.size() + VSword.size();
		int choose = 0;
		do {
			System.out.println("input number");
			try {
				choose =sc.nextInt();sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} while (choose<1 || choose> (range+1));
		
		cls();
		
		if(choose <= VGun.size()) {
			String name= "";
			do {
				System.out.println("weapon name must end -G:");
				try {
					name = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VGun.get(choose-1).setwName(name) != true);
			
			int att = 0;
			do {
				System.out.println("enter damage 20 - 450: ");
				try {
					att = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} while (VGun.get(choose-1).setAtk(att)!=true);
			
			int price = 0;
			do {
				System.out.println("enter price 1500 - 10000: ");
				try {
					price = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VGun.get(choose-1).setPrice(price)!=true);
			
			int ammoCap = 0;
			do {
				System.out.println("enter ammo cap must be multiple of 2: ");
				try {
					ammoCap = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VGun.get(choose-1).setAmmoCap(ammoCap)==false);
			
			int ammoL = 0;
			do {
				System.out.println("enter your ammoLevel: ");
				try {
					ammoL = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VGun.get(choose-1).setAmmoLevel(ammoL)!=true);
		}else {
			int index = choose - VSword.size();
			String name = "";
			do {
				System.out.println("sword name end with -S: ");
				try {
					name = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VSword.get(index-1).setwName(name)!=true);
			
			int att = 0;
			do {
				System.out.println("input attack 50 - 500: ");
				try {
					att = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VSword.get(index-1).setAtk(att)!=true);
			
			int price = 0;
			do {
				System.out.println("input price 1500 - 10000: ");
				try {
					price = sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VSword.get(index-1).setPrice(price)!=true);
			
			int shar = 0;
			do {
				System.out.println("sharpness 1-5: ");
				try {
					shar =sc.nextInt();sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} while (VSword.get(index-1).setSharp(shar)!=true);
		}
		cls();
		System.out.println("Success updating weapon");
		System.out.println("Press Enter to Continue");
		sc.nextLine();
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose =-1;
		do {
			cls();
			System.out.println("====================");
			System.out.println("1. add weapon");
			System.out.println("2. view weapon");
			System.out.println("3. update weapon");
			System.out.println("4. exit");
			System.out.println("====================");
			
			try {
				System.out.println("Choose>>");
				choose = sc.nextInt();sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			switch (choose) {
			case 1:
				addWeapon();
				break;
			
			case 2:
				view(0);
				break;
				
			case 3:
				update();
				break;
			default:
				break;
			}
		} while (choose !=4);
			
	}

	public static void main(String[] args) {
		new Main();
	}

}
