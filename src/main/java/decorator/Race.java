package decorator;

public class Race {
    public static void main(String[] args) {
        Car camaro = new Camaro();
        camaro.rideFast();
        Car boostedCamaro = new NitroBoostedCar(camaro);
        boostedCamaro.rideFast();
    }
}
