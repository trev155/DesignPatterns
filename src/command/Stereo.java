package command;

public class Stereo {
    private boolean isOn;

    public Stereo() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Turned stereo on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Turned stereo off");
    }
}
