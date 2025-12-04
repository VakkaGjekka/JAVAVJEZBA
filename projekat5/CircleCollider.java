package projekat4;

public class CircleCollider implements Collidable {
    private final int centerX;
    private final int centerY;
    private final int radius;

    public CircleCollider(int centerX, int centerY, int radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be > 0");
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getCenterX(){ return centerX; }
    public int getCenterY(){ return centerY; }
    public int getRadius(){ return radius; }

    @Override
    public boolean intersects(Collidable other) {
        if (other instanceof CircleCollider) {
            CircleCollider c = (CircleCollider) other;
            long dx = (long)this.centerX - c.centerX;
            long dy = (long)this.centerY - c.centerY;
            long dist2 = dx*dx + dy*dy;
            long rsum = (long)this.radius + c.radius;
            return dist2 <= rsum*rsum;
        } else if (other instanceof RectangleCollider) {
            RectangleCollider r = (RectangleCollider) other;
            // Find closest point on rectangle to circle center
            int closestX = clamp(this.centerX, r.getX(), r.getX() + r.getWidth());
            int closestY = clamp(this.centerY, r.getY(), r.getY() + r.getHeight());
            long dx = (long)this.centerX - closestX;
            long dy = (long)this.centerY - closestY;
            return dx*dx + dy*dy <= (long)this.radius * this.radius;
        }
        return false;
    }

    private int clamp(int val, int min, int max) {
        if (val < min) return min;
        if (val > max) return max;
        return val;
    }

    @Override
    public String toString() {
        return String.format("Circle[cx=%d,cy=%d,r=%d]", centerX, centerY, radius);
    }
}