package strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new QuackSqueak();
    }
}
