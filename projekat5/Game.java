package projekat4;

import java.util.ArrayList;

class Game {
	Player player;
    ArrayList<Enemy> enemies = new ArrayList<>();
    ArrayList<String> eventLog = new ArrayList<>();

    public Game(Player p) {
        this.player = p;
    }

    public void addEnemy(Enemy e) {
        if (e == null) throw new IllegalArgumentException("Enemy ne može biti null");
        enemies.add(e);
    }
    public void checkCollision() {
        for (Enemy e : enemies) {
            if (player.getCollider().intersects(e.getCollider())) {
                eventLog.add("HIT: " + e.getDisplayName());
                player.decreaseHealth(e.getEffectiveDamage());
            }
        }
    }

    public void showLog() {
        System.out.println("=== EVENT LOG ===");
        for (String s : eventLog) System.out.println(s);
    }

	public void setPlayer(Player player2) {
		
		// TODO Auto-generated method stub
		this.player = player2;
		
		
	}

	public void resolveCollisions() {
		// TODO Auto-generated method stub
		checkCollision();
		
		
	}
}

