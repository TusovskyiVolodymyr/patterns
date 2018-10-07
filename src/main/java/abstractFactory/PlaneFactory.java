package abstractFactory;

public class PlaneFactory implements MilitaryFactory {
    public PlaneFactory() {
    }

    public static Plane getPlane(PlaneType planeType) {
        Plane plane = null;
        switch (planeType) {
            case REACTIVE: {
                plane = new ReactivePlane();
            }
            case PROPPELLER: {
                plane = new PropellerPlane();
            }
            return plane;
        }
        return null;
    }

    @Override
    public Plane createMachine(String s) {
        Plane plane = null;
        switch (s) {
            case "Reactive": {
                plane = new ReactivePlane();
            }
            case "Propeller": {
                plane = new PropellerPlane();
            }
            return plane;
        }
        return null;
    }
}

