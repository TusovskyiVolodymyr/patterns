package adapter;

public class App {
    public static void main(String[] args) {
        Truck truck1 = new EuropeTruck(100, 5);
        AmericanTruck car2 = new AmericanTruck(49, 7);
        AmericanToEuropeAdapter speedConverter = new AmericanToEuropeAdapter(car2);
        System.out.println(speedConverter.getCurrentSpeed());
        System.out.println(speedConverter.getWeight());
    }
}
