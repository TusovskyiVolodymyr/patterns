package factoryMethod;

public class App {
    public static void main(String[] args) {
        Tank tank = TankFactory.getTank(TankType.ARTILLERY);
        System.out.println(tank.toString());
    }
}
