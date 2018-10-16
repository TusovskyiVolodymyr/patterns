package abstractFactory;

import abstractFactory.MilitaryFactory;
import abstractFactory.tank.Artillery;
import abstractFactory.tank.HeavyTank;
import abstractFactory.tank.LightTank;
import abstractFactory.tank.Tank;

public class TankFactory implements MilitaryFactory {
    public TankFactory() {
    }

    @Override
    public Tank createMachine(String s) {
        Tank tank = null;
        switch (s) {
            case "Heavy": {
                tank = new HeavyTank();
                break;
            }
            case "Light": {
                tank = new LightTank();
                break;
            }
            case "Artillery": {
                tank = new Artillery();
                break;
            }
        }
        return tank;
    }
}
