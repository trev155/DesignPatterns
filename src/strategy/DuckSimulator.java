package strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.performFly();
        duck1.performQuack();

        Duck duck2 = new RedheadDuck();
        duck2.performFly();
        duck2.performQuack();

        Duck duck3 = new RubberDuck();
        duck3.performFly();
        duck3.performQuack();

        duck3.setFlyBehaviour(new FlyWithRocket());
        duck3.setQuackBehaviour(new QuackMute());
        duck3.performFly();
        duck3.performQuack();
    }
}
