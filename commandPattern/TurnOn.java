package commandPattern;

public class TurnOn implements Command {

    private Device device;

    public TurnOn(Device device){
        this.device = device;
    }
    @Override
    public String execute() {
        return device.turnOn();
    }

}
