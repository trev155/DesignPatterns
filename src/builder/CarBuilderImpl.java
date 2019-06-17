package builder;

public class CarBuilderImpl implements CarBuilder {
    private Car carTemp;

    public CarBuilderImpl() {
        carTemp = new Car();
    }

    @Override
    public Car build() {
        Car car = new Car();
        car.setColor(carTemp.getColor());
        car.setWheels(carTemp.getWheels());
        return car;
    }

    @Override
    public CarBuilder setColor(final String color) {
        carTemp.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setWheels(final int wheels) {
        carTemp.setWheels(wheels);
        return this;
    }
}
