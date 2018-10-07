package factoryMethod;

public class LightTank extends Tank {

    public LightTank(int maxSpeed, int maxDamage, int protection) {
        super(maxSpeed, maxDamage, protection);
    }

    public LightTank() {
    }

    //    @Override
//    public String toString() {
//        return "LightTank{maxSpeed= " + this.getMaxSpeed() +
//                "maxDamage= " + this.getMaxDamage() +
//                "protection= " + this.getProtection() + "]}";
//    }
}
