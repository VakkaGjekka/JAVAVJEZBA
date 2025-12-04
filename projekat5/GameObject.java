package projekat4;

public abstract class GameObject {
    private int x;
    private int y;
    private Collidable collider;

    public GameObject(int x, int y, Collidable collider) {
        if (collider == null) throw new IllegalArgumentException("Collider cannot be null");
        this.x = x;
        this.y = y;
        this.collider = collider;
    }

    public int getX(){ return x; }
    public int getY(){ return y; }
    public void setX(int x){ this.x = x; }
    public void setY(int y){ this.y = y; }

    public Collidable getCollider(){ return collider; }
    public void setCollider(Collidable c){
        if (c == null) throw new IllegalArgumentException("Collider cannot be null");
        this.collider = c;
    }

    public boolean intersects(GameObject other) {
        if (other == null) return false;
        return this.collider.intersects(other.collider);
    }

    public abstract String getDisplayName();

    @Override
    public String toString(){
        return String.format("%s at (%d,%d) with %s", getDisplayName(), x, y, collider);
    }
}
