package mediator;

public interface Dispatcher {
    void registerDriver(Driver driver);
    void registerClient(TaxiClient client);
    boolean isFreeTaxi();
    boolean isClientsQueue();
    void setToClientTaxi();
}
