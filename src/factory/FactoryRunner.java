package factory;

public class FactoryRunner {
    public static void main(String[] args) {
        ChocolateStore chocolateStoreNorth = new ChocolateStoreNorth();
        ChocolateStore chocolateStoreSouth = new ChocolateStoreSouth();

        Chocolate c1 = chocolateStoreNorth.orderChocolate(ChocolateType.DARK);
        System.out.println("---Ordered chocolate---\n" + c1.getInfo() + "\n");

        Chocolate c2 = chocolateStoreSouth.orderChocolate(ChocolateType.DARK);
        System.out.println("---Ordered chocolate---\n" + c2.getInfo() + "\n");

        Chocolate c3 = chocolateStoreNorth.orderChocolate(ChocolateType.MILK);
        System.out.println("---Ordered chocolate---\n" + c3.getInfo() + "\n");

        Chocolate c4 = chocolateStoreSouth.orderChocolate(ChocolateType.MILK);
        System.out.println("---Ordered chocolate---\n" + c4.getInfo() + "\n");

        Chocolate c5 = chocolateStoreNorth.orderChocolate(ChocolateType.WHITE);
        System.out.println("---Ordered chocolate---\n" + c5.getInfo() + "\n");

        Chocolate c6 = chocolateStoreSouth.orderChocolate(ChocolateType.WHITE);
        System.out.println("---Ordered chocolate---\n" + c6.getInfo() + "\n");
    }
}
