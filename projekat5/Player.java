package projekat4;

public class Player extends GameObject {
    private final String name;
    private int health; 

    public Player(String name, int health, int x, int y, Collidable collider) {
        super(x, y, collider);
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        String processed = capitalizeFirst(name.trim());
        if (processed.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        if (health < 0 || health > 100) throw new IllegalArgumentException("Health must be 0..100");
        this.name = processed;
        this.health = health;
    }

    private String capitalizeFirst(String s){
        if (s.isEmpty()) return s;
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    public String getName(){ return name; }
    public int getHealth(){ return health; }
    public void setHealth(int h){
        if (h < 0) h = 0;
        if (h > 100) h = 100;
        this.health = h;
    }

    @Override
    public String getDisplayName() {
        return name;
    }

    @Override
    public String toString(){
        return String.format("Player[%s, health=%d] %s", name, health, super.toString());
    }

	public void decreaseHealth(int effectiveDamage) {
		// TODO Auto-generated method stub
		setHealth(health - effectiveDamage);
		
		
	}
}
