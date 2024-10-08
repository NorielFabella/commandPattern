package commandPattern;

public class Tv implements Device{

    

    public String turnOff(){
        return "Tv is switched-off";
    }

    @Override
    public String turnOn() {
        return "Tv is switched-on";
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
        return "TV's volume increased";
    }

    @Override
    public String decreaseVolume() {
        return "TV's volume decreased";
    }

    @Override
    public String increaseBrightness() {
        return "TV's brightness increased";
    }

    @Override
    public String decreaseBrightness() {
        return "TV's brightness decreased";
    }
}
