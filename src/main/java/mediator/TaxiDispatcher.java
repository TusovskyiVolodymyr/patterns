package mediator;

public class TaxiDispatcher implements Dispatcher {
    private Client client;
    private Driver taxiDriver;

    public void registerDriver(Driver driver) {
        this.taxiDriver = driver;
    }

    public void registerClient(Client client) {
        this.client = client;
    }
}
