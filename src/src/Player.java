package src;

public class Player extends GameObject {
	private String name;
	private int health;
	
	
	public Player(int x, int y, int width, int height, String name, int health) {
		super(x, y, width, height);
		this.name = name;
		this.health = health;
	}


	public String getName() {
		if(name == null && name.isEmpty()) {
			return "Please enter the proper name";
		
		} return name;
	}


	public void setName(String name) {
		this.name=name;
	}


	public int getHealth() {
		if(health >100) {
			return health = 100;
		} else if (health < 0) {
			return health = 0;
		} return health;
	}

	public void setHealth(int health) {
		this.health= health;
	}
	
	
	
	@Override
	public String toString() {
		return "Player name=" + name + ", health=" + health + "";
	}


	public boolean interselect() {
		return true;
	}
	
	

}
