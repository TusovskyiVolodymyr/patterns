package adapter;

public class AmericanToEuropeAdapter extends EuropeTruck {

    private AmericanTruck americanCar;

    public AmericanToEuropeAdapter(AmericanTruck americanCar) {
        this.americanCar = americanCar;
    }

    @Override
    public int getCurrentSpeed() {
        System.out.println("Miles to kilometers");
        return (int) (americanCar.getCurrentSpeed() * 1.6);
    }

    @Override
    public int getWeight() {
        System.out.println("Weight is in kilo");
        return (int) (americanCar.getWeight() * 2.2);
    }
}
