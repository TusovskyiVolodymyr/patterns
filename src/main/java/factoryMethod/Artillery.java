package factoryMethod;

public class Artillery extends Tank {
    public Artillery(int maxSpeed, int maxDamage, int protection) {
        super(maxSpeed, maxDamage, protection);
    }

    public Artillery() {
        this(30, 500, 10);
    }
}
