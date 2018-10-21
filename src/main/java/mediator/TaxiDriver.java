package mediator;

public class TaxiDriver implements Driver {
    private String name;

    public TaxiDriver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getPassengerInfo(TaxiClient client) {
        System.out.println(getName() + " driver will deliver " + client.getName() + " to " + client.getLocation());
    }
}
