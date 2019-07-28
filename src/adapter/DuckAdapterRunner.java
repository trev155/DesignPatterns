package adapter;

public class DuckAdapterRunner {
    public static void main(String[] args) {
        // Create client and adaptee
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        // Create an adapter. The adapter will hold an instance of the adaptee
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // Now, the turkey has a quack() and fly() method, just like a Duck
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

}
