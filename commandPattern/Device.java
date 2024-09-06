package commandPattern;

public interface Device 
{
    String turnOn();
    String turnOff();
    String increaseTemperature();
    String decreaseTemperature();
    String increaseVolume();
    String decreaseVolume();
    String increaseBrightness();
    String decreaseBrightness();
}
