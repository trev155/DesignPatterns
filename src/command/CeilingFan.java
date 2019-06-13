package command;

public class CeilingFan {
    private boolean isOn;

    public CeilingFan() {
        isOn = false;
    }

    public void low() {
        isOn = true;
        System.out.println("Ceiling fan set to low speed");
    }

    public void medium() {
        isOn = true;
        System.out.println("Ceiling fan set to medium speed");
    }

    public void high() {
        isOn = true;
        System.out.println("Ceiling fan set to high speed");
    }

    public void off() {
        isOn = false;
        System.out.println("Ceiling fan off");
    }
}
