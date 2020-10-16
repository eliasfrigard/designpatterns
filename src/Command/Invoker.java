package Command;

/**
 * The invoker in the Command patter.
 * You can think of this as a switch for a light bulb.
 */
public class Invoker {
    ICommand onCommand;
    ICommand offCommand;

    public Invoker (ICommand on, ICommand off) {
        onCommand = on;
        offCommand = off;
    }

    public void switchOn () {
        this.onCommand.execute();
    }

    public void switchOff () {
        this.offCommand.execute();
    }
}
