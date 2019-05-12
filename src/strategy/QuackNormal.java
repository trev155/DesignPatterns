package strategy;

public class QuackNormal implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
