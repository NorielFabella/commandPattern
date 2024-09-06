package commandPattern;

public class DecreaseTemperature implements Command {
    
    private Device device;
    
    

    public DecreaseTemperature(Device device){
        this.device = device;
    }


    @Override
    public String execute() {
        return device.decreaseTemperature();
    }
}
