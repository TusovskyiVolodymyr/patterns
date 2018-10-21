package mediator;

public class TaxiClient implements Client {

    private String name;
    private String location;


    public TaxiClient(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public void getTaxiInformation(String location) {
        System.out.println("Taxi driver "+location +" will drive you "+this.getName());
    }
}
