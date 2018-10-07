package abstractFactory;

public abstract class Tank {
    private int maxSpeed;
    private int maxDamage;
    private int protection;

    public Tank(int maxSpeed, int maxDamage, int protection) {
        this.maxSpeed = maxSpeed;
        this.maxDamage = maxDamage;
        this.protection = protection;
    }

    public Tank() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "maxSpeed=" + maxSpeed +
                ", maxDamage=" + maxDamage +
                ", protection=" + protection +
                '}';
    }
}
