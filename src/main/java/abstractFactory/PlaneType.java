package abstractFactory;

public enum PlaneType {
    REACTIVE("Reactive"), PROPPELLER("Propeller");
    private String value;

    PlaneType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
