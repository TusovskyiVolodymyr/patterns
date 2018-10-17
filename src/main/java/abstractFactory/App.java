package abstractFactory;

import abstractFactory.tank.Tank;
import abstractFactory.tank.TankType;

public class App {
    public static void main(String[] args) {
        TankFactory tankFactory = (TankFactory) Factory.getFactory(FactoryType.TANK_FACTORY);
        Tank tank = tankFactory.createMachine(TankType.ARTILLERY.getValue());
        Tank tank2 = tankFactory.createMachine(TankType.HEAVY.getValue());
        System.out.println(tank.toString());
        System.out.println(tank2.toString());
    }
}
