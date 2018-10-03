package decorator;

public class NitroBoostedCar extends CarWorkShop {

    public NitroBoostedCar(Car car) {
        super(car);
    }

    public void rideFast() {
        car.rideFast();
        System.out.println("Turning on boost...");
        System.out.println(car.getClass().getSimpleName() + " is moving with speed: " + getMaxSpeed());

    }

    public int getMaxSpeed() {
        return car.getMaxSpeed() + 50;
    }
}
