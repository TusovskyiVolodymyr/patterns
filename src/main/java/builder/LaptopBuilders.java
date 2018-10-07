package builder;

public abstract class LaptopBuilders {
    protected Laptop laptop;

    public LaptopBuilders() {
        this.laptop = new Laptop();
    }

    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildDisplay();
    public abstract void buildVideoCard();
    public abstract void buildRam();

    public Laptop getLaptop() {
        return laptop;
    }
}
