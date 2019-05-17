package decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        // Plain object, no decorators
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());

        // One decorator
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());

        // Multiple decorators
        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.getCost());

        // Multiple repeated decorators
        Beverage beverage4 = new Decaf();
        beverage4 = new Mocha(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Milk(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.getCost());
    }
}
