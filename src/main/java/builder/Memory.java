package builder;

public abstract class Memory {
    protected int memorySize;

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public Memory(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memorySize=" + memorySize +
                '}';
    }
}
