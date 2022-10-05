public final class CarLight extends Car {
    enum BodyType {
        SEDAN, HATCHBACK, COUPE, STATION_WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN;
        BodyType() {
        }
    }

    public CarLight(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        setBodyType(bodyType);
    }

    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    void identifyAuto() {
        if(bodyType==null){
            System.out.println("данных по авто недостаточно");
        }else System.out.println("Тип кузова " + bodyType);
    }
}
