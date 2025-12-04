package projekat4;

public class Enemy extends GameObject implements Attacker {
    private final String type;
    private final int damage; 
    private int health; 

    public Enemy(String type, int damage, int health, int x, int y, Collidable collider) {
        super(x, y, collider);
        if (type == null) throw new IllegalArgumentException("Type cannot be null");
        String t = type.trim();
        if (t.isEmpty()) throw new IllegalArgumentException("Type cannot be empty");
        if (damage < 0 || damage > 100) throw new IllegalArgumentException("Damage must be 0..100");
        if (health < 0 || health > 100) throw new IllegalArgumentException("Health must be 0..100");
        this.type = t;
        this.damage = damage;
        this.health = health;
    }

    public String getType(){ return type; }
    public int getDamage(){ return damage; }
    public int getHealth(){ return health; }
    public void setHealth(int h){
        if (h < 0) h = 0;
        if (h > 100) h = 100;
        this.health = h;
    }

    @Override
    public int getEffectiveDamage() {
        return damage;
    }

    @Override
    public String getDisplayName() {
        return type;
    }

    @Override
    public String toString(){
        return String.format("Enemy[%s, dmg=%d, hp=%d] %s", type, damage, health, super.toString());
    }
}
