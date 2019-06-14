package command;

public class CeilingFanOnMediumCommand implements Command {
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanOnMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
