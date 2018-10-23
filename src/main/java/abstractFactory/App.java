package abstractFactory;

import abstractFactory.tank.Tank;
import abstractFactory.tank.TankType;

public class App {
    public static void main(String[] args) {
        TankFactory tankFactory = (TankFactory) Factory.getFactory(FactoryType.TANK_FACTORY);
        Tank tank = tankFactory.createMachine(TankType.ARTILLERY.getValue());
        System.out.println(tank.toString());
    }
}
