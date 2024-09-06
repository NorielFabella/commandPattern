package commandPattern;

public class DecreaseBrightness implements Command {
    
    private Device device;
    
    

    public DecreaseBrightness(Device device){
        this.device = device;
    }


    @Override
    public String execute() {
        return device.decreaseBrightness();
    }
}