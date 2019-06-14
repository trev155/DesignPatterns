package command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan() {
        speed = OFF;
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling fan set to low speed");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling fan set to medium speed");
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling fan set to high speed");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan off");
    }

    public int getSpeed() {
        return speed;
    }
}
