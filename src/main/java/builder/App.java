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

        laptop =  new Laptop.CustomLaptop()
                .setCpu(new CPU(CPU.CPUType.INTEL, 3.5, 7, 9))
                .setDisplay(new Display(Display.DisplayType.IPS, Display.Resolution.DISPLAY4K))
                .build();
        System.out.println(laptop);
    }
}
