package decorator;

public class Camaro implements Car {
    private int maxSpeed = 250;

    public void rideFast() {
        System.out.println("Camaro is moving with speed: " + getMaxSpeed());
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
