public class Driver<T extends Car> {
    private T car;

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    private String name;
    private boolean driverLicense;
    private int drivingExperience;

    public Driver(String name, boolean driverLicense, int drivingExperience, T car) {
        setName(name);
        setDriverLicense(driverLicense);
        setDrivingExperience(drivingExperience);
        setCar(car);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "имя водителя не указано";
        }
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience > 0) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = -1;
        }
    }

    void moveStart() {
        car.moveStart();
    }

    void moveEnd() {
        car.moveEnd();
    }

    void refill() {
        car.refill();
    }

    void participation() {
        System.out.println("водитель " + name + " управляет автомобилем " + car + " и будет участвовать в заезде");
    }
}
