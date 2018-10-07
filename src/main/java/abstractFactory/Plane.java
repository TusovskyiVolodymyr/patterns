package abstractFactory;

public abstract class Plane {
    private int maxFlyightHeight;
    private int maxSpeed;

    public Plane(int maxFlyightHeight, int maxSpeed) {
        this.maxFlyightHeight = maxFlyightHeight;
        this.maxSpeed = maxSpeed;
    }

    public Plane() {
    }

    public int getMaxFlyightHeight() {
        return maxFlyightHeight;
    }

    public void setMaxFlyightHeight(int maxFlyightHeight) {
        this.maxFlyightHeight = maxFlyightHeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "maxFlyightHeight=" + maxFlyightHeight +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
