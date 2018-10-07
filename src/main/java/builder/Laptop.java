package builder;


public class Laptop {
    private CPU cpu;
    private Memory memory;
    private Ram ram;
    private VideoCard videoCard;
    private Display display;

    private Laptop(LaptopBuilder laptopBuilder) {
    }

    public Laptop() {
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", ram=" + ram +
                ", videoCard=" + videoCard +
                ", display=" + display +
                '}';
    }

    public static abstract class LaptopBuilder {

        protected static Laptop laptop;

        public abstract void buildCpu();

        public abstract void buildMemory();

        public abstract void buildDisplay();

        public abstract void buildVideoCard();

        public abstract void buildRam();

        public  Laptop build(){
            laptop = new Laptop(this);
            return laptop;
        }
    }
}
