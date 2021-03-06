package command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOff();
    }

    @Override
    public void undo() {
        stereo.turnOn();
    }
}
