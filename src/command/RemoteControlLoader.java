package command;

public class RemoteControlLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Receiver objects
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();
        Stereo stereo = new Stereo();

        // Command objects
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // setCommand() to load Command objects into the Invoker
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl.toString());

        // simulate button presses
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(2);
        remoteControl.offButtonPressed(3);
    }
}
