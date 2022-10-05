public abstract class Transport {
    final private String brand;
    final private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    protected abstract void refill();

    public Transport(String brand, String model) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "не указана марка";
        }
        if (brand != null) {
            this.model = model;
        } else {
            this.model = "не указана марка";
        }
    }
}
