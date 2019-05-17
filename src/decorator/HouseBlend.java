package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
