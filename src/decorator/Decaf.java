package decorator;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double getCost() {
        return 0.75;
    }
}
