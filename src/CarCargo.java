public final class CarCargo extends Car {
    enum LoadCapasity {
        N1(0.1f, 3.4f), N2(3.5f, 11.99f), N3(12.00f, 100.00f);

        private float low, high;

        public void setLow(float low) {
            if (low > 0.0f) {
                this.low = low;
            } else {
                this.low = -1.0f;
            }
        }

        public void setHigh(float high) {
            if (high > 0.0f) {
                this.high = high;
            } else {
                this.high = -1.0f;
            }
        }

        public float getLow() {
            return low;
        }

        public float getHigh() {
            return high;
        }

        LoadCapasity(float low, float high) {
            setLow(low);
            setHigh(high);
        }

        public void identifyAuto(float f) {

        }
    }

    public CarCargo(String brand, String model, float engineVolume, LoadCapasity loadCapasity) {
        super(brand, model, engineVolume);
        setLoadCapasity(loadCapasity);
    }

    private LoadCapasity loadCapasity;

    public LoadCapasity getLoadCapasity() {
        return loadCapasity;
    }

    public void setLoadCapasity(LoadCapasity loadCapasity) {
        this.loadCapasity = loadCapasity;
    }

    @Override
    void identifyAuto() {
        if (loadCapasity == null) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println("грузоподьемность от " + loadCapasity.getLow() + " до " + loadCapasity.getHigh());
        }
    }
}
