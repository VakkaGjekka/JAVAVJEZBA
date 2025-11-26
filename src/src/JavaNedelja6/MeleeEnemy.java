package src;

public class MeleeEnemy extends Enemy {
	
	

	public MeleeEnemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height, type, damage, health);
		// TODO Auto-generated constructor stub
	}
	 
	public int getAttack() {
		return getDamage();
	}
	@Override
	public String toString() {
		return "MeleeEnemy" + super.toString();
	}

}

