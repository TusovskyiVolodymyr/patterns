package decorator;

public abstract class CarWorkShop implements Car {

    protected Car car;

    public CarWorkShop(Car car) {
        this.car = car;
    }

    public void rideFast() {
        car.rideFast();
    }

    public int getMaxSpeed() {
        return car.getMaxSpeed();
    }
}
