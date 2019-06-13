package command;

public class GarageDoor {
    private boolean isOpen;
    private boolean isLightOn;

    GarageDoor() {
        isOpen = false;
        isLightOn = false;
    }

    public void up() {
        isOpen = true;
        lightOn();
        System.out.println("Garage Door Up");
    }

    public void down() {
        isOpen = false;
        lightOff();
        System.out.println("Garage Door Down");
    }

    private void lightOn() {
        isLightOn = true;
        System.out.println("Garage light on");
    }

    private void lightOff() {
        isLightOn = false;
        System.out.println("Garage light off");
    }
}
