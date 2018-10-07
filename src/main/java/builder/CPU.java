package builder;

public class CPU {

    private CPUType cpuType;
    private double frequency;
    private int generation;
    private int series;

    public enum CPUType {
        INTEL("Intel"), AMD("Amd");

        private String value;

        CPUType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public CPU(CPUType cpuType, double frequency, int generation, int series) {
        this.cpuType = cpuType;
        this.frequency = frequency;
        this.generation = generation;
        this.series = series;
    }

    public CPUType getCpuType() {
        return cpuType;
    }

    public void setCpuType(CPUType cpuType) {
        this.cpuType = cpuType;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "cpuType=" + cpuType.getValue() +
                ", frequency=" + frequency + "GHz" +
                ", generation=" + generation +
                ", series=" + series +
                '}';
    }
}
