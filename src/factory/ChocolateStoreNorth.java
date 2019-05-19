package factory;

// A chocolate store in the north side of the city
public class ChocolateStoreNorth extends ChocolateStore {
    @Override
    public Chocolate makeChocolate(ChocolateType chocolateType) {
        switch (chocolateType) {
            case MILK:
                return new MilkChocolateNorth();
            case WHITE:
                return new WhiteChocolateNorth();
            case DARK:
                return new DarkChocolateNorth();
            default:
                return null;
        }
    }
}
