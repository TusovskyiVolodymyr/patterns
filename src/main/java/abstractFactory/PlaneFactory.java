package abstractFactory;

import abstractFactory.MilitaryFactory;
import abstractFactory.plane.Plane;
import abstractFactory.plane.PropellerPlane;
import abstractFactory.plane.ReactivePlane;

public class PlaneFactory implements MilitaryFactory {
    public PlaneFactory() {
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

