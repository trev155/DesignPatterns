package command;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        // Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Receiver
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remote.setCommand(garageDoorCloseCommand);
        remote.buttonWasPressed();
    }
}
