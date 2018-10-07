package builder;

public class OfficeLaptopBuilder extends LaptopBuilders {

    @Override
    public void buildCpu() {
        laptop.setCpu(new CPU(CPU.CPUType.INTEL, 2.5, 8, 5));
    }

    @Override
    public void buildMemory() {
        laptop.setMemory(new HDD(500));
    }

    @Override
    public void buildDisplay() {
        laptop.setDisplay(new Display(Display.DisplayType.IPS, Display.Resolution.HD));
    }

    @Override
    public void buildVideoCard() {
        laptop.setVideoCard(new VideoCard(VideoCard.VideoCardType.ATI_RADEON, 1024));
    }

    @Override
    public void buildRam() {
        laptop.setRam(new Ram(6));
    }

    @Override
    public Laptop getLaptop() {
        return super.getLaptop();
    }
}
