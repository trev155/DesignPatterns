package strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new QuackNormal();
    }
}
