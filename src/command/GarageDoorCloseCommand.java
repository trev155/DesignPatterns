package command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
