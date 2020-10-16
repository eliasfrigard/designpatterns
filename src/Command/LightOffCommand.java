package Command;

public class LightOffCommand implements ICommand {
    RecieverLightBulb lb;

    public LightOffCommand (RecieverLightBulb lb) {
        this.lb = lb;
    }

    public void execute() {
        lb.turnOff();
    }

    /**
     * Undo does the reverse of execute.
     */
    public void undo() {
        lb.turnOn();
    }
}
