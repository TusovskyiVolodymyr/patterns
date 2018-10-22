package templateMethod;

public class Cappuchino extends Coffe {

    @Override
    protected void putWatter() {
        System.out.println("No water in capuchino");
    }

    @Override
    protected void putMilk() {
        System.out.println("Putted 40% of milk");
    }

    @Override
    protected void putCoffee() {
        System.out.println("Putted 60% of coffee");
    }
}
