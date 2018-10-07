package builder;

public class HDD extends Memory {
    public HDD(int memorySize) {
        super(memorySize);
    }

    @Override
    public String toString() {
        return "HDD{" +
                "memorySize=" + memorySize +"Gb"+
                '}';
    }
}
