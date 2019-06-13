package command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // Nothing
    }

    @Override
    public void undo() {
        // Nothing
    }
}
