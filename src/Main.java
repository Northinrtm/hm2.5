public class Main {

    public static void main(String[] args) {
        CarLight carLight = new CarLight("toyota", "a1", 1.5f);
        CarLight carLight1 = new CarLight("победа", "123", 1.2f);
        CarLight carLight2 = new CarLight("жигули", "a8", 1.6f);
        CarLight carLight3 = new CarLight("волга", "b1", 1.7f);

        CarCargo carCargo = new CarCargo("Kamaz", "u1", 4.5f);
        CarCargo carCargo1 = new CarCargo("Урал", "в1231", 4.6f);
        CarCargo carCargo2 = new CarCargo("Трак", "1цц1", 4.2f);
        CarCargo carCargo3 = new CarCargo("Kamaz", "й14", 4.5f);

        Bus bus = new Bus("Kamaz", "qwe", 2.5f);
        Bus bus1 = new Bus("Уаз", "йцуe", 2.2f);
        Bus bus2 = new Bus("Икарус", "12e", 2.6f);
        Bus bus3 = new Bus("Kamaz", "511", 2.5f);

        Driver<CarCargo> dcargo = new Driver<>("Артур",true, 10, carCargo1);
            dcargo.refill();
            dcargo.participation();
            dcargo.moveStart();
    }
}