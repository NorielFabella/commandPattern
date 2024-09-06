package commandPattern;

public class Lights implements Device
{
    
    @Override
    public String turnOn() {
        return "Lights are switched-on and at brightness level 70%";
    }

    @Override
    public String turnOff() {
        return "Lights are switched-off";
       
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
        return "Nothing happened";
    }

    @Override
    public String decreaseVolume() {
        return "Nothing happened";
    }

    @Override
    public String increaseBrightness() {
        return "Light's brightness increased";
    }

    @Override
    public String decreaseBrightness() {
        return "Light's brightness decreased";
    }
}
