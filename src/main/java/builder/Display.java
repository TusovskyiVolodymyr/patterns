package builder;

public class Display {

    private DisplayType displayType;
    private Resolution resolution;

    public enum DisplayType {

        OLED("Oled display"), IPS("IPS display");

        private String value;

        DisplayType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Resolution {
        HD("1920*1080"), DISPLAY4K("3840*2160");

        private String value;

        Resolution(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Display(DisplayType displayType, Resolution resolution) {
        this.displayType = displayType;
        this.resolution = resolution;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Display{" +
                "displayType=" + displayType.getValue() +
                ", resolution=" + resolution.getValue() +
                '}';
    }
}
