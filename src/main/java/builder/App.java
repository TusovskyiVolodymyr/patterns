package builder;

public class App {
    public static void main(String[] args) {
        LaptopBuilders laptopBuilder = new GamingLaptop();
        ShopWorker shopWorker = new ShopWorker(laptopBuilder);
        shopWorker.constructLaptop();
        Laptop laptop = shopWorker.getLaptop();
        System.out.println(laptop.toString());

        laptopBuilder = new OfficeLaptopBuilder();
        shopWorker.setLaptopBuilder(laptopBuilder);
        shopWorker.constructLaptop();
        laptop = shopWorker.getLaptop();
        System.out.println(laptop);

    }
}
