package Command;

public class LightOnCommand implements ICommand {
    RecieverLightBulb lb;

    public LightOnCommand (RecieverLightBulb lb) {
        this.lb = lb;
    }

    public void execute() {
        lb.turnOn();
    }

    /**
     * Undo does the reverse of execute.
     */
    public void undo() {
        lb.turnOff();
    }
}
