package command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
        // empty
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
