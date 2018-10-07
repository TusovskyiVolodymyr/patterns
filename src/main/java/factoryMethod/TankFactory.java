package factoryMethod;

public class TankFactory {
    private TankFactory() {
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
}
