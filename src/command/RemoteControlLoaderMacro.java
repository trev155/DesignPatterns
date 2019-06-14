package command;

public class RemoteControlLoaderMacro {
    public static void main(String[] args) {
        Light light = new Light();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        CeilingFanOnHighCommand ceilingFanOnHighCommand = new CeilingFanOnHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] allOn = {lightOnCommand, stereoOnCommand, garageDoorOpenCommand, ceilingFanOnHighCommand};
        Command[] allOff = {lightOffCommand, stereoOffCommand, garageDoorCloseCommand, ceilingFanOffCommand};
        MacroCommand allOnMacroCommand = new MacroCommand(allOn);
        MacroCommand allOffMacroCommand = new MacroCommand(allOff);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        remoteControl.setCommand(0, allOnMacroCommand, allOffMacroCommand);
        System.out.println(remoteControl.toString());
        remoteControl.onButtonPressed(0);

    }
}
