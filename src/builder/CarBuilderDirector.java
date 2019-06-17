package builder;

public class CarBuilderDirector {
    private CarBuilder builder;

    public CarBuilderDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct(int wheels, String color) {
        return builder.setWheels(wheels)
                .setColor(color)
                .build();
    }

    public static void main(String[] args) {
        final CarBuilder builder = new CarBuilderImpl();
        final CarBuilderDirector carBuilderDirector = new CarBuilderDirector(builder);
        Car car = carBuilderDirector.construct(4, "Red");
        System.out.println(car);
    }
}
