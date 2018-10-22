package adapter;

public class EuropeTruck extends Truck {

    public EuropeTruck() {
    }

    public EuropeTruck(int currentSpeed, int weight) {
        super(currentSpeed, weight);
    }

    @Override
    public int getCurrentSpeed() {
        System.out.println(super.getCurrentSpeed() + " in kilometers");
        return super.getCurrentSpeed();
    }

    @Override
    public int getWeight() {
        System.out.println("Weight is: " + super.getWeight() + " tonnes");
        return super.getWeight();
    }
}
