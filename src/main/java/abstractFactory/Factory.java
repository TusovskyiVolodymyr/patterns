package abstractFactory;

public class Factory {
    public static MilitaryFactory getFactory(FactoryType factoryType) {
        MilitaryFactory militaryFactory = null;
        switch (factoryType) {
            case TANK_FACTORY:{
                militaryFactory = new TankFactory();
                break;
            }
            case PLANE_FACTORY:{
                militaryFactory = new PlaneFactory();
                break;
            }
        }
        return militaryFactory;
    }

}
