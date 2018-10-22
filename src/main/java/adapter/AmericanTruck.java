package adapter;

public class AmericanTruck extends Truck {

    public AmericanTruck(int currentSpeed, int weight) {
        super(currentSpeed, weight);
    }

    @Override
    public int getCurrentSpeed() {
        System.out.println(currentSpeed + " miles");
        return super.getCurrentSpeed();
    }

    @Override
    public int getWeight() {
        System.out.println("Weight is: " + super.getWeight() + " pounds");
        return super.getWeight();
    }
}
