package mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Dispatcher {
    private List<Driver> drivers;
    private List<TaxiClient> clients;

    public TaxiDispatcher() {
        this.drivers = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void registerClient(TaxiClient client) {
        clients.add(client);
    }

    @Override
    public boolean isFreeTaxi() {
        return drivers.size() > 0;
    }

    @Override
    public boolean isClientsQueue() {
        return clients.size() > 0;
    }

    @Override
    public void setToClientTaxi() {
        while (isFreeTaxi() && isClientsQueue()) {
            drivers.get(0).getPassengerInfo(clients.get(0));
            clients.get(0).getTaxiInformation(drivers.get(0).getName());
            drivers.remove(0);
            clients.remove(0);
        }
    }
}
