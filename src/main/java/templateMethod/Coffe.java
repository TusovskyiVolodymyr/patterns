package templateMethod;

public abstract class Coffe {

    public final void makeCoffeeDrink() {
        putCoffee();
        putMilk();
        putWatter();
        putSugar();
    }

    protected void putSugar() {
        System.out.println(String.format("Given 2 spun of sugar \nYour %s is ready!\n", this.getClass().getSimpleName()));
    }

    protected abstract void putWatter();

    protected abstract void putMilk();

    protected abstract void putCoffee();
}
