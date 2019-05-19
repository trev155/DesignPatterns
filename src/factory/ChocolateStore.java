package factory;

public abstract class ChocolateStore {
    public Chocolate orderChocolate(ChocolateType chocolateType) {
        Chocolate chocolate = makeChocolate(chocolateType);

        chocolate.getInfo();
        chocolate.box();
        chocolate.deliver();

        return chocolate;
    }

    // Factory method
    protected abstract Chocolate makeChocolate(ChocolateType chocolateType);
}
