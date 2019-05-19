package factory;

public abstract class Chocolate {
    private String name;
    private String ingredients;

    public void box() {
        System.out.println("Packaging chocolate in box...");
    }

    public void deliver() {
        System.out.println("Delivering chocolate...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public String getIngredients() {
        return this.ingredients;
    }

    public String getInfo() {
        return "Chocolate Name: " + getName() + ", Ingredients: " + getIngredients();
    }
}
