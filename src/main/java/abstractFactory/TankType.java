package abstractFactory;

public enum TankType {
    HEAVY("Heavy"), LIGHT("Light"), ARTILLERY("Artillery");

    private String value;

    TankType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
