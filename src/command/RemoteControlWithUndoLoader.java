package command;

public class RemoteControlWithUndoLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // Receiver objects
        Light livingRoomLight = new Light();
        Stereo stereo = new Stereo();

        // Command objects
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // setCommand() to load Command objects into the Invoker
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl.toString());

        // simulate button presses - including an undo
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(3);
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonPressed();
    }
}
