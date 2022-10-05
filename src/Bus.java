public final class Bus extends Car {
    enum TypeCapasity {
        VERY_SMALL(1, 10), SMALL(11, 25), AVERAGE(40, 50), BIG(60, 80), VERY_BIG(100, 120);
        private int low, high;

        public int getLow() {
            return low;
        }

        public void setLow(int low) {
            if (low > 0) {
                this.low = low;
            } else {
                this.low = -1;
            }
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            if (high > 0) {
                this.high = high;
            } else {
                this.high = -1;
            }
        }

        TypeCapasity(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

    public Bus(String brand, String model, float engineVolume, TypeCapasity typeCapasity) {
        super(brand, model, engineVolume);
        setTypeCapasity(typeCapasity);
    }

    private TypeCapasity typeCapasity;

    public TypeCapasity getTypeCapasity() {
        return typeCapasity;
    }

    public void setTypeCapasity(TypeCapasity typeCapasity) {
        this.typeCapasity = typeCapasity;
    }

    @Override
    void identifyAuto() {
        if (typeCapasity == null) {
            System.out.println("данных по авто недостаточно");
        } else {
            System.out.println("вместимость от " + typeCapasity.getLow() + " до " + typeCapasity.getHigh());
        }
    }
}
