package mediator;

public class App {
    public static void main(String[] args) {
        Dispatcher dispatcher = new TaxiDispatcher();
        Driver driver = new TaxiDriver("John");
//        Driver driver2 = new TaxiDriver("John2");
//        Driver driver3 = new TaxiDriver("John3");
        dispatcher.registerDriver(driver);
//        dispatcher.registerDriver(driver2);
//        dispatcher.registerDriver(driver3);
        TaxiClient client = new TaxiClient("Bill",  "Stryiska");
//        TaxiClient client2 = new TaxiClient("Bill2 ", "Horbachevskogo");
//        TaxiClient client3 = new TaxiClient("Bill3", "Shuvar");
        dispatcher.registerClient(client);
//        dispatcher.registerClient(client2);
//        dispatcher.registerClient(client3);
        dispatcher.setToClientTaxi();
    }
}
