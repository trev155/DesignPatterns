package factory;

// A chocolate store in the south side of the city
public class ChocolateStoreSouth extends ChocolateStore {
    @Override
    public Chocolate makeChocolate(ChocolateType chocolateType) {
        switch (chocolateType) {
            case MILK:
                return new MilkChocolateSouth();
            case WHITE:
                return new WhiteChocolateSouth();
            case DARK:
                return new DarkChocolateSouth();
            default:
                return null;
        }
    }
}
