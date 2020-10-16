package Command;

/**
 * Interface for commands.
 * The undo() method is not used in this example, but note that it could be used to revoke the previous command.
 */
public interface ICommand {
    public void execute();
    public void undo();
}
