package bridge;

public abstract class Warrior {
    private int health;
    private Weapon weapon;
    private boolean isAlive;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void fight() {
        weapon.shout();
    }
}
