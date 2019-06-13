package command;

public class RemoteControl {
    private static int numSlots = 7;
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[numSlots];
        offCommands = new Command[numSlots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------- Remote Control ----------\n");
        for (int i = 0; i < numSlots; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
