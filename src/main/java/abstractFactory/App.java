package abstractFactory;

public class App {
    public static void main(String[] args) {
        TankFactory tankFactory = new TankFactory();
        Tank tank = tankFactory.createMachine(TankType.ARTILLERY.getValue());
        System.out.println(tank.toString());
        PlaneFactory militaryFactory = new PlaneFactory();
        Plane plane = militaryFactory.createMachine(PlaneType.PROPPELLER.getValue());
        System.out.println(plane.toString());
    }
}
