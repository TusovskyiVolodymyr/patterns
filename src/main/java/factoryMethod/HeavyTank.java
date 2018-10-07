package factoryMethod;

public class HeavyTank extends Tank {

    public HeavyTank(int maxSpeed, int maxDamage, int protection) {
        super(maxSpeed, maxDamage, protection);
    }

    public HeavyTank() {
        this(40, 300, 200);
    }
}
