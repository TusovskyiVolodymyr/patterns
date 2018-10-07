package builder;

public class ShopWorker {
    private LaptopBuilders laptopBuilder;

    public ShopWorker(LaptopBuilders laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop getLaptop() {
        return laptopBuilder.getLaptop();
    }

    public void setLaptopBuilder(LaptopBuilders laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public void constructLaptop() {
        this.laptopBuilder.buildCpu();
        this.laptopBuilder.buildDisplay();
        this.laptopBuilder.buildMemory();
        this.laptopBuilder.buildRam();
        this.laptopBuilder.buildVideoCard();
    }
}
