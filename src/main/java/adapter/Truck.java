package adapter;

public abstract class Truck {
    protected int currentSpeed;
    protected int weight;

    public Truck() {
    }

    public Truck(int currentSpeed, int weight) {
        this.currentSpeed = currentSpeed;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
