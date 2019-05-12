package strategy;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new QuackSqueak();
    }
}
