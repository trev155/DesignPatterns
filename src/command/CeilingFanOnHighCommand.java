package command;

public class CeilingFanOnHighCommand implements Command {
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanOnHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (previousSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        } else if (previousSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (previousSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (previousSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
    }
}

