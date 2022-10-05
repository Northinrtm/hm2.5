public final class CarCargo extends Car {
    enum LoadCapasity {
        N1(0.1f, 3.4f), N2(3.5f, 11.99f), N3(12.00f, 100.00f);

        private final float low, high;

        LoadCapasity(float low, float high) {
            this.low = low;
            this.high = high;
        }
    }

    public CarCargo(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
}
