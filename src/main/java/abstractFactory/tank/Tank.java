package abstractFactory.tank;

public abstract class Tank {
    private int maxSpeed;
    private int maxDamage;
    private int protection;
    private static int count = 1;

    public Tank(int maxSpeed, int maxDamage, int protection) {
        System.out.println("Tanks created:" + count + " | tank type: " + this.getClass().getSimpleName());
        this.maxSpeed = maxSpeed;
        this.maxDamage = maxDamage;
        this.protection = protection;
        count++;
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