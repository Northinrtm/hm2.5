public final class CarLight extends Car {
    enum BodyType {
        SEDAN, HATCHBACK, COUPE, STATION_WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN;
        BodyType() {
        }
    }

    public CarLight(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
}
