package template;

public class BeverageRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("____________\nPreparing Coffee\n_____________");
        coffee.prepareRecipe();
        System.out.println("____________\nPreparing Tea\n_____________");
        tea.prepareRecipe();
    }
}
