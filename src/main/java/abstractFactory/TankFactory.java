package abstractFactory;

public class TankFactory implements MilitaryFactory {
    public TankFactory() {
    }

    public static Tank getTank(TankType tankType) {
        Tank tank = null;
        switch (tankType) {
            case HEAVY: {
                tank = new HeavyTank();
            }
            case LIGHT: {
                tank = new LightTank();
            }
            case ARTILLERY: {
                tank = new Artillery();
            }
            return tank;
        }
        return null;
    }

    @Override
    public Tank createMachine(String s) {
        Tank tank = null;
        switch (s) {
            case "Heavy": {
                tank = new HeavyTank();
            }
            case "Light": {
                tank = new LightTank();
            }
            case "Artillery": {
                tank = new Artillery();
            }
            return tank;
        }
        return null;
    }
}
