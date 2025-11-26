package src;

public class Enemy extends GameObject {
	private String type;
	private int damage;
	private int health;
	
	
	public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height);
		this.type = type;
		this.damage = damage;
		this.health = health;
	}


	public String getType() {
		if(type == null && type.isEmpty()) {
			return " type cannot be empty";
		}return type;
		} 
	


	public void setType(String type) {
		this.type = type;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	@Override
	public String toString() {
		return "Enemy type=" + type + ", damage=" + damage + ", health=" + health + "";
	}
	
	public boolean interselect(Player p, Enemy e) {
		boolean collisionDetected=
    			p.getX() < e.getX() + e.getWidth() &&
    		   p.getX() + p.getWidth() > e.getX() &&
    		   p.getY() < e.getY() + e.getHeight() &&
    		   p.getY() + p.getHeight() > e.getY();
    		   return collisionDetected;
	}

	public void attack(Player player) {
		int newHealth = player.getHealth() - this.damage;
		player.setHealth(newHealth);
	}
	
	public void addTheEnemy(Enemy enemy) {
		System.out.println("there has been a new enemy added to the game:" + enemy.getType());
		
	}

}
