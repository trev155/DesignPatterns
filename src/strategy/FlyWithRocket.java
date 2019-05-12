package strategy;

public class FlyWithRocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
