package templateMethod;

public class Americano extends Coffe {
    @Override
    protected void putMilk() {
        System.out.println("Those americano without milk");
    }

    @Override
    protected void putCoffee() {
        System.out.println("Putted 40% coffee");
    }

    @Override
    protected void putWatter() {
        System.out.println("Putted 60% of water");
    }
}
