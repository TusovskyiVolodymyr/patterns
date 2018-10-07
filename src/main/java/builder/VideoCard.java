package builder;

public class VideoCard {

    private VideoCardType videoCardType;
    private int memoryVolume;

    public enum VideoCardType {
        NVIDIA("Nvidia"), ATI_RADEON("Ati Radeon");

        private String value;

        VideoCardType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public VideoCard(VideoCardType videoCardType, int memoryVolume) {
        this.videoCardType = videoCardType;
        this.memoryVolume = memoryVolume;
    }

    public VideoCardType getVideoCardType() {
        return videoCardType;
    }

    public void setVideoCardType(VideoCardType videoCardType) {
        this.videoCardType = videoCardType;
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }

    public void setMemoryVolume(int memoryVolume) {
        this.memoryVolume = memoryVolume;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "videoCardType=" + videoCardType.getValue() +
                ", memoryVolume=" + memoryVolume +
                '}';
    }
}
