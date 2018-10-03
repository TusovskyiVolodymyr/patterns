package mediator;

public interface Dispatcher {
    void registerDriver(Driver driver);
    void registerClient(Client client);
}
