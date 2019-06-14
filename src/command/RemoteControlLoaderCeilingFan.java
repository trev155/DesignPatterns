package command;

public class RemoteControlLoaderCeilingFan {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanOnLowCommand ceilingFanOnLowCommand = new CeilingFanOnLowCommand(ceilingFan);
        CeilingFanOnMediumCommand ceilingFanOnMediumCommand = new CeilingFanOnMediumCommand(ceilingFan);
        CeilingFanOnHighCommand ceilingFanOnHighCommand = new CeilingFanOnHighCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanOnLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanOnMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanOnHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonPressed(2);
        remoteControl.undoButtonPressed();
    }
}