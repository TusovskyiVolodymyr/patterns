package builder;


public class Laptop {
    private CPU cpu;
    private Memory memory;
    private Ram ram;
    private VideoCard videoCard;
    private Display display;

    private Laptop(CustomLaptop laptopBuilder) {
        this.cpu = laptopBuilder.cpu;
        this.memory = laptopBuilder.memory;
        this.ram = laptopBuilder.ram;
        this.videoCard = laptopBuilder.videoCard;
        this.display = laptopBuilder.display;
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

    public static class CustomLaptop {
        private CPU cpu;
        private Memory memory;
        private Ram ram;
        private VideoCard videoCard;
        private Display display;

        public CustomLaptop setCpu(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public CustomLaptop setMemory(Memory memory) {
            this.memory = memory;
            return this;
        }

        public CustomLaptop setRam(Ram ram) {
            this.ram = ram;
            return this;
        }

        public CustomLaptop setVideoCard(VideoCard videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public CustomLaptop setDisplay(Display display) {
            this.display = display;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
