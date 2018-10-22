package templateMethod;

public class App {
    public static void main(String[] args) {
        Coffe coffe = new Americano();
        coffe.makeCoffeeDrink();
        coffe = new Cappuchino();
        coffe.makeCoffeeDrink();
    }
}
