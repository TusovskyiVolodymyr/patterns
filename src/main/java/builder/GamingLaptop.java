package builder;

public class GamingLaptop extends LaptopBuilders {


    @Override
    public void buildCpu() {
        laptop.setCpu(new CPU(CPU.CPUType.INTEL, 3.5, 5, 9));
    }

    @Override
    public void buildMemory() {
        laptop.setMemory(new SSD(1000));
    }

    @Override
    public void buildDisplay() {
        laptop.setDisplay(new Display(Display.DisplayType.OLED, Display.Resolution.DISPLAY4K));
    }

    @Override
    public void buildVideoCard() {
        laptop.setVideoCard(new VideoCard(VideoCard.VideoCardType.NVIDIA, 4096));
    }

    @Override
    public void buildRam() {
        laptop.setRam(new Ram(16384));
    }

}
