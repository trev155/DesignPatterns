package decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 1.09;
    }
}
