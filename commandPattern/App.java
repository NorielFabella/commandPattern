package commandPattern;

public class App {
    public static void main(String[] args){
        Device tv = new Tv();
        Device lights = new Lights();
        Device mp = new MusicPlayer();
        Device thermo = new Thermostat();
        

       TurnOn turnOn = new TurnOn(tv);
       System.out.println(turnOn.execute());

       TurnOff turnOff = new TurnOff(lights);
       System.out.println(turnOff.execute());

       IncreaseBrightness increaseBrightness = new IncreaseBrightness(lights);
       System.out.println(increaseBrightness.execute());

       DecreaseBrightness decreaseBrightness = new DecreaseBrightness(mp);
       System.out.println(decreaseBrightness.execute());

       IncreaseTemperature increaseTemperature = new IncreaseTemperature(thermo);
       System.out.println(increaseTemperature.execute());

       DecreaseTemperature decreaseTemperature = new DecreaseTemperature(tv);
       System.out.println(decreaseTemperature.execute());

       IncreaseVolume increaseVolume = new IncreaseVolume(mp);
       System.out.println(increaseVolume.execute());

       DecreaseVolume decreaseVolume = new DecreaseVolume(tv);
       System.out.println(decreaseVolume.execute());

       



        
    }
}
