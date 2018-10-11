package abstractFactory;

public class App {
    public static void main(String[] args) {
        TankFactory tankFactory = new TankFactory();
        Tank tank = tankFactory.createMachine(TankType.ARTILLERY.getValue());
        System.out.println(tank.toString());
    }
}
