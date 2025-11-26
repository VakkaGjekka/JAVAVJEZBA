package src;

import java.util.ArrayList;

class Player {
	private String name;
	private String Type;
	private int X;
	private int Y;
	private int width;
	private int height;
	private int health;
	

	public Player(String name, String type, int x, int y, int width, int height, int health) {
		super();
		this.name = name;
		this.Type = type;
		this.X = x;
		this.Y = y;
		this.width = width;
		this.height = height;
		this.health = health;
		
		
	}


	public String getName() {
		if (name == null || name.isEmpty()) {
			return "Player name cannot be empty";
		}
		if (name.trim().replaceAll(" +", " ") != null) {
			return "Player name must not have space in between";
		}
		return name;
		
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public int getX() {
		return X;
	}


	public void setX(int x) {
		X = x;
	}


	public int getY() {
		return Y;
	}


	public void setY(int y) {
		Y = y;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getHealth() {
		if (health < 0 ) {
			return 0;
			
		} else if (health > 100) {
			return 100;
		}return health;
	
	}


	public void setHealth(int health) {
		this.health = health;
	}


	@Override
	public String toString() {
		return "Player1 name=" + name + ", Type=" + Type + ", X=" + X + ", Y=" + Y + ", width=" + width + ", height="
				+ height + ", health=" + health + "]";
	}
	

}

class Enemy {
		private String enemyType;
		private int damage;
		private int X;
		private int Y;
		private int width;
		private int height;

		public Enemy(String enemyType, int damage, int x, int y, int width, int height) {
			this.enemyType = enemyType;
			this.damage = damage;
			this.X = x;
			this.Y = y;
			this.width = width;
			this.height = height;
			
		}

		public String getEnemyType() {
			return enemyType;
		}

		public void setEnemyType(String enemyType) {
			this.enemyType = enemyType;
		}

		public int getDamage() {
			if (damage < 0) {
				return 0;
			}else if (damage > 100) {
                return 100;
			
			}
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}

		public int getX() {
			return X;
		}

		public void setX(int X) {
			return;
		}

		public int getY() {
			return Y;
		} 

		public void setY(int Y) {
			this.Y = Y;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		

		public void attack(Player player) {
			int newHealth = player.getHealth() - this.damage;
			player.setHealth(newHealth);
		}
		
	

    @Override
		public String toString() {
			return " enemyType=" + enemyType + ", damage=" + damage + "]";
		}
    public static boolean CheckCollision(Player player, Enemy enemy) {
    	boolean collisionDetected=
    			player.getX() < enemy.getX() + enemy.getWidth() &&
    		   player.getX() + player.getWidth() > enemy.getX() &&
    		   player.getY() < enemy.getY() + enemy.getHeight() &&
    		   player.getY() + player.getHeight() > enemy.getY();
    		   return collisionDetected;
    }
				public static void resolveCollision(){
					if (CheckCollision(player, enemy)) {
        System.out.println(" Collision detected between " + player.getName() + " and " + enemy.getEnemyType());
        
        
        enemy.attack(player);

       
        System.out.println(player.getName() + " takes " + enemy.getDamage() + " damage!");
        System.out.println("Remaining health: " + player.getHealth());
				}




	public class Game {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Player> players = new ArrayList<>();
		players.add(new Player("Hero", "Warrior", 10, 10, 50, 50, 100));
		players.add(new Player("Mage", "Wizard", 100, 100, 60, 60, 80));
		
		ArrayList<Enemy> enemies = new ArrayList<>();
		enemies.add(new Enemy("Goblin", 20, 10, 10, 50, 50));
		enemies.add(new Enemy("Orc", 30, 100, 100, 60, 60));
		
		System.out.println("=== Players ===");
        for (Player player : players) {
            System.out.println(player);
        }

        System.out.println(" Enemies ");
        for (Enemy enemy : enemies) {
            System.out.println(enemy);
        }
        System.out.println(" Collision Check: ");

        
        for (Player player : players) {
            for (Enemy enemy : enemies) {
                if (Enemy.CheckCollision(player, enemy)) {
                    System.out.println(" Collision detected between " + player.getName() + " and " + enemy.getEnemyType());
                    enemy.attack(player);
                    System.out.println(player.getName() + " was attacked! Health is now: " + player.getHealth());
                } else {
                    System.out.println("No collision between " + player.getName() + " and " + enemy.getEnemyType());
                }
																
}

		}
	}

	
	
	}
}

}




	
	





	



