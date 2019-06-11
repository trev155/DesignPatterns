package command;

public class Light {
    private boolean isOn;

    Light() {
        isOn = false;
    }

    public void on() {
        isOn = true;
        System.out.println("Turning light on");
    }

    public void off() {
        isOn = false;
        System.out.println("Turning light off");
    }
}
