package strategy;

public class QuackMute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<-- Silence -->>");
    }
}

