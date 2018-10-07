package builder;

public class SSD extends Memory {
    public SSD(int memorySize) {
        super(memorySize);
    }

    @Override
    public String toString() {
        return "SSD{" +
                "memorySize=" + memorySize + "Gb" +
                '}';
    }
}
