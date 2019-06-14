package command;

public class CeilingFanOnLowCommand implements Command {
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanOnLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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
