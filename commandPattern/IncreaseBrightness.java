package commandPattern;

public class IncreaseBrightness implements Command {
    
    private Device device;
    
    

    public IncreaseBrightness(Device device){
        this.device = device;
    }


    @Override
    public String execute() {
        return device.increaseBrightness();
    }
}
