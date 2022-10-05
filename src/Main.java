public class Main {

    public static void main(String[] args) {
        CarLight carLight = new CarLight("toyota", "a1", 1.5f, CarLight.BodyType.CROSSOVER);
        CarLight carLight1 = new CarLight("победа", "123", 1.2f, CarLight.BodyType.COUPE);
        CarLight carLight2 = new CarLight("жигули", "a8", 1.6f, CarLight.BodyType.MINIVAN);
        CarLight carLight3 = new CarLight("волга", "b1", 1.7f, CarLight.BodyType.HATCHBACK);

        CarCargo carCargo = new CarCargo("Kamaz", "u1", 4.5f, CarCargo.LoadCapasity.N2);
        CarCargo carCargo1 = new CarCargo("Урал", "в1231", 4.6f, CarCargo.LoadCapasity.N3);
        CarCargo carCargo2 = new CarCargo("Трак", "1цц1", 4.2f, CarCargo.LoadCapasity.N1);
        CarCargo carCargo3 = new CarCargo("Kamaz", "й14", 4.5f, CarCargo.LoadCapasity.N2);

        Bus bus = new Bus("Kamaz", "qwe", 2.5f, Bus.TypeCapasity.BIG);
        Bus bus1 = new Bus("Уаз", "йцуe", 2.2f, Bus.TypeCapasity.AVERAGE);
        Bus bus2 = new Bus("Икарус", "12e", 2.6f, Bus.TypeCapasity.VERY_BIG);
        Bus bus3 = new Bus("Kamaz", "511", 2.5f, Bus.TypeCapasity.VERY_SMALL);

        carLight.identifyAuto();
        carCargo1.identifyAuto();
        bus.identifyAuto();
    }
}