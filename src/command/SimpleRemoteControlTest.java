package command;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        // Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Receiver
        Light light = new Light();

        // Commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();
    }
}
