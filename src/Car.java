public class Car extends Transport implements Competing {
    private float engineVolume;

    public Car(String brand, String model, float engineVolume) {
        super(brand, model);
        if (engineVolume > 0.0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = -1.0f;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    void moveStart() {
        System.out.println("начать движение");
    }

    void moveEnd() {
        System.out.println("закончить движение");
    }


    @Override
    public void bestLapTime() {
        System.out.println("Car.bestLapTime()");
    }

    @Override
    public void pitStop() {
        System.out.println("Car.pitStop()");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Car.maxSpeed()");
    }

    @Override
    protected void refill() {
        System.out.println("Car.refill()");
    }
}