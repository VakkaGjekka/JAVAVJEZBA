package src;

public class BossEnemy extends Enemy {
	
	

	public BossEnemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height, type, damage, health);
		// TODO Auto-generated constructor stub
	}
	public int getAttack() {
		return getDamage() * 2;
	}
	@Override
	public String toString() {
		return "BossEnemy " + super.toString() + " gives damage";
		
	}

}
