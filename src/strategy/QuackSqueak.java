package strategy;

public class QuackSqueak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
