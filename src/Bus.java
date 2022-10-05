public final class Bus extends Car {
    enum TypeCapasity {
        VERY_SMALL(1, 10), SMALL(11, 25), AVERAGE(40, 50), BIG(60, 80), VERY_BIG(100, 120);
        private int low, high;

        TypeCapasity(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
}
