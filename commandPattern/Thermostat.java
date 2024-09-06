package commandPattern;

public class Thermostat implements Device
{

    @Override
    public String turnOn() {
        return "Thermostat is switched-on";
    }

    @Override
    public String turnOff() {
        return "Thermostat is switched-off";
    }

    @Override
    public String increaseTemperature() {
        return "Temperature increased";
    }

    @Override
    public String decreaseTemperature() {
        return "Temperature decreased";
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
        return "Nothing happened";
    }

    @Override
    public String decreaseBrightness() {
        return "Nothing happened";
    }
    
}