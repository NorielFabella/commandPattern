package commandPattern;

public class MusicPlayer implements Device
{
    

    @Override
    public String turnOn() {
        return "Music Player is switched-on and will play a specific playlist";
    }

    @Override
    public String turnOff() {
        return "Music Player is switched-off";
    }

    @Override
    public String increaseTemperature() {
        return "Nothing happened";
    }

    @Override
    public String decreaseTemperature() {
        return "Nothing happened";
    }

    @Override
    public String increaseVolume() {
        return "Volume increased";
    }

    @Override
    public String decreaseVolume() {
        return "Volume decreased";
    }

    @Override
    public String increaseBrightness() {
        return "Nothing happened";
    }

    @Override
    public String decreaseBrightness() {
        return "Nothing happened";
    }
}
